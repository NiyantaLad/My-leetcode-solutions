class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map <Integer, Integer> map = new HashMap<>();
        int[] output = new int[2];
        for(int j=0; j<nums.length;j++){
            map.put(nums[j],j);
        }
        
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff) && map.get(diff)!=i){
                if((i+1)<(map.get(diff)+1)){
                    output[0]=i+1;
                    output[1]=map.get(diff)+1;
                }
                else{
                    output[1]=i+1;
                    output[0]=map.get(diff)+1;
                }
            }
        }
        Arrays.sort(output);
        return (output);
    }
}