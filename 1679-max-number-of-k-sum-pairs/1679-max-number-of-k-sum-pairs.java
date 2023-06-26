class Solution {
    public int maxOperations(int[] nums, int k) {
//         Map<Integer, Integer> map = new HashMap<>();
//         int ct=0;
        
//         for(int i=0;i<nums.length;i++){
//             int diff=k-nums[i];            
//             if(map.getOrDefault(diff,0)>0){
//                 map.put(diff,map.get(diff)-1);
//                 ct++;
//             }
//             else{
//                 map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             }  
//         }
//         return ct;
//     }
        
       
	Map<Integer, Integer> map = new HashMap<>();
	int result = 0;
	for(int i: nums)
		if(map.containsKey(i) && map.get(i) > 0) {
			map.put(i, map.get(i) - 1);
			result ++;
		} else map.put(k-i, map.getOrDefault(k-i, 0) + 1);
	return result;
}
}