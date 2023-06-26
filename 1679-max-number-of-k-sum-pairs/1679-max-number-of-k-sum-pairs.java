class Solution {
    public int maxOperations(int[] nums, int k) {
        
        // Map<Integer, Integer> map = new HashMap<>();
        // int result = 0;
        // for(int i: nums)
        //     if(map.containsKey(i) && map.get(i) > 0) {
        //         map.put(i, map.get(i) - 1);
        //         result ++;
        //     } else map.put(k-i, map.getOrDefault(k-i, 0) + 1);
        // return result;
        
        Arrays.sort(nums);
        int result = 0, i =0, j= nums.length -1;
        while(i<j)
            if(nums[i]+nums[j] > k) j--;
            else if(nums[i]+nums[j] < k) i++;
            else {i++;j--;result++;}
        return result;
    }
}