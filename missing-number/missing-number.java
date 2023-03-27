class Solution {
    public int missingNumber(int[] nums) {

        // sum of n natural numbers
        int n=nums.length;
        int sum=0;
        for (int i=0; i<n;i++){
            sum=sum+nums[i];
        }
        int res= ((n*(n+1))/2)-sum;
        return res;
        
        
        // int n=nums.length;
        // Arrays.sort(nums);
        // for (int i=0; i<n;i++){
        //     if(i!=nums[i])
        //         return i;
        // }
        // return n;
        
    }
}