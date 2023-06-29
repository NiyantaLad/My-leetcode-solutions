class Solution {
    public String removeStars(String s) {
        char[] ch = new char[s.length()];
        int j=0;
        for(int i=0;i<s.length();i++){
            char c= s.charAt(i);
            if(c=='*')
                j--;
            else
                ch[j++]=c;
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