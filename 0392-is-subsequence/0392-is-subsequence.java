class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        int m=s.length();
        int n=t.length();
        int i=0,j=0;
        if(m<1) return true;        
        while (i<n){
            if (tarr[i]==sarr[j]){
                j++;
            }
            i++;        
        if(j==m)
            return true;
        }
        return false;    
    }
}