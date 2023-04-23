class Solution {
    public int maximumCount(int[] nums) {
        int l=0, r= nums.length-1,mid=0;
        if(nums[0]>0 || nums[r]<0) return nums.length; 
        
        
        while(l<r){
            mid= l + (r-l)/2;
            if(nums[mid]<0)
                l= mid+1;
            else
                r= mid;
        }
        // find 0
        while (l < r) {
          mid = l + (r - l) / 2;
          if (nums[mid] < 0) l = mid + 1;
          else r = mid;
        }

        // currently, `l` is pointing to the left most position that nums[l] >= 0
        int neg = l;

        // Move l to right to exclude zeros.
        while (l < nums.length && nums[l] == 0) l++;
        int pos = nums.length - l;

        return Math.max(neg, pos);
    }
}