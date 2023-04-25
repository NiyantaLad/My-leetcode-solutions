class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int i=0,j=0;
        if(s.length()<1) return true;        
        while (i<t.length()){
            if (tarr[i]==sarr[j]){
                j++;
            }
            i++;        
        if(j==s.length())
            return true;
        }
        return false;    
    }
}