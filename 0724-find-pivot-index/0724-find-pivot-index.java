class Solution {
    public int pivotIndex(int[] nums) {
        int sum=0, lsum=0;        
        for (int i=0; i<nums.length;i++){
            sum = sum + nums[i];
        }        
        for (int i=0; i <nums.length; i++){
            if (sum-nums[i]==lsum)
                return i;
            lsum= lsum+nums[i];
            sum= sum-nums[i];
        }
        return -1;
        }    
}