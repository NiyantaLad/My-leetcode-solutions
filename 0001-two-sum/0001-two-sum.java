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


// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int[] output = new int[2];

//         for (int i=0; i<nums.length;i++){
//             if (map.containsKey(nums[i]) && nums[i]==target-nums[i])
//                 {
//                 output[1]=i;
//                 output[0]= map.get(target-nums[i]);
//                 return output;         
//                 }
//             else
//                 map.put(nums[i],i);
//         }
       
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//             // System.out.println(entry.getKey()+ ": "+entry.getValue());   
//             if (map.containsKey(target-entry.getKey())){
//                 output[1]= entry.getValue();
//                 output[0]= map.get(target-entry.getKey());
//             }
//         }   
//         return output;
//     }
// }