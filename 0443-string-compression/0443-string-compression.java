class Solution {
    public int compress(char[] chars) {
        int j=0;
        int i=0;
        int index=0;        
        while(i<chars.length){
            int count=0;
            while (j<chars.length && chars[i]==chars[j]   ){                
                j++;
                count++; 
            }               
            chars[index++] =chars[i]; 
            if(count!=1){
                for (char x: Integer.toString(count).toCharArray()){
                chars[index++]=x;
                }
            }
            i=j;
        }
        return index;
    }
}