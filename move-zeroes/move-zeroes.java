class Solution {
    public void moveZeroes(int[] nums) {
        // for (int i =0; i<nums.length-1;i++){
            int i=0;
            int j=0;
            // int temp=0;
            while(j!=nums.length){
                int temp=0;
                if (nums[j]!=0){
                    temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                    i++;
                }
                j++;
            }
    }
}