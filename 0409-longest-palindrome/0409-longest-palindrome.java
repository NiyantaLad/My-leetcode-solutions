class Solution {
    public int longestPalindrome(String s) {
        if (s.length()==1) return 1;
        Set<Character> set = new HashSet<>();
        int count=0;
        for (int i =0; i< s.length();i++){
            char ch= s.charAt(i);
            if(set.contains(ch)){
                set.remove(ch);
                count++;
            }
            else{
                set.add(ch);
            }
        }    
            if(set.isEmpty()) return count*2;
            else return count*2+1;        
    }
}