class Solution {
    public boolean isPalindrome(int x) {
        
        if(x < 0) 
            return false; 
        
        
        //Approach 1: convert to string
//         String s = Integer.toString(x);
//         char[] xarr = s.toCharArray() ;
        
//         int i=0;
//         int j=xarr.length-1;
        
//         while(i<j){
//             if(xarr[i]!=xarr[j])
//                 return false;
//             i++;
//             j--;
//         }
        
//         return true;
        
        
        //Approach 2: without converting to string
        
        int reversed=0, remainder, original=x;
        while(x!=0){
            remainder = x%10;
            reversed = reversed*10 + remainder;
            x=x/10;
        }
        return original==reversed;
        
    }
}