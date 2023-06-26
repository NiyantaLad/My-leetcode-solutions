class Solution {
    public int maxOperations(int[] nums, int k) {
        //using two pointers
        // Time: O(nlogn)
        // Space: O(1)
        Arrays.sort(nums);
        int result = 0, i =0, j= nums.length -1;
        while(i<j)
            if(nums[i]+nums[j] > k) 
                j--;
            else if(nums[i]+nums[j] < k) 
                i++;
            else {
                i++;
                j--;
                result++;
            }
        return result;
        }
    }