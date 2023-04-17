class Solution {
    public int removeElement(int[] nums, int val) {
        
        int i=0;
        int j=0;
        while(j!=nums.length){
            int temp=0;
            if (nums[j]!=val){
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
            }
            j++;
        }
        return i;
    }
}