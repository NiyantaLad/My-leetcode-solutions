class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        
        for (int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        
        for(int j=0; j<nums.length;j++){
            int diff= target-nums[j];
            if(map.containsKey(diff) && map.get(diff)!=j){
                output[0]=map.get(diff);
                output[1]=j;
            }
        }
        return output;
    }
}