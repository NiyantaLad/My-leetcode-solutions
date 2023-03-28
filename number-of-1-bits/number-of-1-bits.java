public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        // return Integer.bitCount(n);
        
        
        int count=0;
        while(n!=0){
            if((n&1)==1)      //last bit is 1
                count++;
            n=n>>>1;
        }
        return count;
    }
}