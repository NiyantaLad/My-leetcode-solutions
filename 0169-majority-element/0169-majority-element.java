class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        int majority=0;
        int maxCount=0;
        if (nums.length==1)
            return nums[0];
        for (int i=0; i<nums.length;i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], (map.get(nums[i])) + 1);                
                if( (map.get(nums[i])>maxCount)){
                    majority=nums[i];
                    maxCount=map.get(nums[i]);
                }                                
            }                                      
            else {
                map.put(nums[i],1);
            }
        }
        return majority;
    }                                      
}