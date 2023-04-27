class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder ans= new StringBuilder();
        for (String w: words){
            int i=0, j = w.length()-1;
            char[] word = w.toCharArray();
            char temp;
            while(i<j){
                temp=word[i];
                word[i]=word[j];
                word[j]=temp;
                i++;
                j--;  
            }
            ans.append(word);
            ans.append(" ");            
        }

        // ans.setLength(ans.length() - 1);
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}