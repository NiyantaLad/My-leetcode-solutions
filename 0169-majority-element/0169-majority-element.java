// class Solution {
//     public int majorityElement(int[] nums) {
//         HashMap <Integer, Integer> map = new HashMap<>();
//         int majority=0;
//         int maxCount=0;
//         if (nums.length==1)
//             return nums[0];
//         for (int i=0; i<nums.length;i++){
//             if (map.containsKey(nums[i])){
//                 map.put(nums[i], (map.get(nums[i])) + 1);                
//                 if( (map.get(nums[i])>maxCount)){
//                     majority=nums[i];
//                     maxCount=map.get(nums[i]);
//                 }                                
//             }                                      
//             else {
//                 map.put(nums[i],1);
//             }
//         }
//         return majority;
//     }                                      
// }

class Solution {
    private Map<Integer, Integer> countNums(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (!counts.containsKey(num)) {
                counts.put(num, 1);
            }
            else {
                counts.put(num, counts.get(num)+1);
            }
        }
        return counts;
    }

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = countNums(nums);

        Map.Entry<Integer, Integer> majorityEntry = null;
        for (Map.Entry<Integer, Integer> entry : counts.entrySet()) {
            if (majorityEntry == null || entry.getValue() > majorityEntry.getValue()) {
                majorityEntry = entry;
            }
        }

        return majorityEntry.getKey();
    }
}