class Solution {
    public int searchInsert(int[] nums, int target) {
//         int mid = nums.length/2;
//         if (target == nums[mid]){
//             return mid;
//         }
//         else if (target< nums[mid]){
//             for (int i =0; i<mid; i++){
//                 if (nums[i]==target){
//                     return i;
//                 }
//                 else if (nums[i] < target && target < nums[i+1])
//                     return i+1;
//             }
//         }
//         else if (target> nums[mid]){
//             for (int i =mid+1; i<nums.length; i++){
//                 if (nums[i]==target)
//                     return i;
//                 else if (nums[i] < target && target < nums[i+1])
//                     return i+1;
                
//             }
//         }
//         return 0;
        
        
        int left=0;
        int right= nums.length;
        
        while(left<right){
            int mid= left+(right-left)/2;
            if(nums[mid]==target)
                return mid;
            else if (target < nums[mid])
                right=mid;
            else if (target > nums[mid])
                left=mid+1;
        }
        return right;

    }
}