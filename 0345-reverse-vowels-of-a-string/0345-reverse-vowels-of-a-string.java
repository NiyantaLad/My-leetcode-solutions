class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        int i=0;
        int j=s.length()-1;
        char[] sarr = s.toCharArray();
        
        while(i<j){
            if((vowels.indexOf(sarr[i])!=-1) && (vowels.indexOf(sarr[j])!=-1)) {
                char temp= sarr[i];
                sarr[i]=sarr[j];
                sarr[j]=temp;
                i++;
                j--;
            }
            else if(!(vowels.indexOf(sarr[i])!=-1))
                i++;
            else if(!(vowels.indexOf(sarr[j])!=-1))
                j--;
        }
        return String.valueOf(sarr);
    }
}