class Solution {
    public int hammingDistance(int x, int y) {
        return Integer.bitCount(x^y);
    }
}


// x=1-->0 0 0 1
// y=4-->0 1 0 0
//XOR x^y-->0 1 0 1
// Integer.bitCount(x^y)--> no. of ones in 0 1 0 1 -->2