class Solution {
    public int[] plusOne(int[] digits) {
        int len= digits.length;
        for (int i=len-1;i>=0;i--){
            if (digits[i]<9){
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] resDigit = new int[len+1];
        resDigit[0]=1;
        return resDigit;  
}
}