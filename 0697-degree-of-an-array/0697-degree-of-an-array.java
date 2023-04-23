class Solution{
    public int findShortestSubArray(int[] nums){
        Map<Integer, Integer> count = new HashMap<>(), firstOccurence = new HashMap<>();
        int res=0, degree=0;
        
        for (int i =0; i<nums.length; i++){
            firstOccurence.putIfAbsent(nums[i],i);
            count.put(nums[i],count.getOrDefault(nums[i],0)+1);
            
            if (count.get(nums[i])>degree){
                degree = count.get(nums[i]);
                res = i - firstOccurence.get(nums[i])+1;
            }
            else if (count.get(nums[i])==degree){
                res= Math.min(res,(i - firstOccurence.get(nums[i]))+1);
            }
        }
        return res;
    }
}













// class Solution {
//     public int findShortestSubArray(int[] nums) {
//         Map<Integer, Integer> map = new HashMap<>();
//         for (int i : nums){
//             map.put(i,map.getOrDefault(i,0)+1);
//         }        
//         List <Integer> maxVallist = new ArrayList<>();
//         List <Integer> smallestLength = new ArrayList<>();
//         int maxValueInMap = (Collections.max(map.values()));
//         for (Map.Entry<Integer, Integer> entry : map.entrySet()) {  
//             if (entry.getValue()==maxValueInMap) {
//                 maxVallist.add(entry.getKey());
//             }
//         }
//         for (int key : maxVallist){
//             int start = 0;
//             int end = nums.length-1 ;
//             if(nums[start] != key)
//                start++;
//             if(nums[end] != key)
//                end--;
//             smallestLength.add ((end-start)+1);
//         }
//         for (int i:smallestLength){
//             System.out.println(i);
//         }
//        return (Collections.min(smallestLength));
//     }
// }