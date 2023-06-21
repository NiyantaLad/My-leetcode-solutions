class Solution {
    public String reverseWords(String s) {
        // s=s.trim().replaceAll(" +", " ");
        String[] strArr = s.split(" +");       
        int i=0;
        int j= strArr.length-1;
        while(i<j){
                String temp = strArr[i];
                strArr[i]=strArr[j];
                strArr[j]=temp;
                i++;
                j--;          
        }
        StringBuilder result = new StringBuilder();
        for(int k=0; k<strArr.length;k++){
            result.append(strArr[k]);
            result.append(" ");
        }
        return result.toString().trim();
    }
}