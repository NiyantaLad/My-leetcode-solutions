class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] xarr = s.toCharArray() ;
        
        int i=0;
        int j=xarr.length-1;
        
        while(i<j){
            if(xarr[i]!=xarr[j])
                return false;
            i++;
            j--;
        }
        
        return true;
    }
}