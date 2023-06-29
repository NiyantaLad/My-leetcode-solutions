class Solution {
    public String removeStars(String s) {
        char[] ch = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*')
                j--;
            else
                ch[j++]=s.charAt(i);
        }
        
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i<j){
            sb.append(ch[i]);
            i++;
        }
       return sb.toString();
    }
}