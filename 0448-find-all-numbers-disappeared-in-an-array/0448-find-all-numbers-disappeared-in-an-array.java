class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
//         int[] count = new int[nums.length];
//         for (int i=0; i<nums.length;i++){
//             count[nums[i]-1]=nums[i];
//         }        
//         for (int j =0; j<count.length;j++){
//             if (count[j]==0)
//                 result.add(j+1);                
//         }
//         return result;
        
        
        // without extra space and in O(n) time
       for (int i=0; i<nums.length;i++){
           while (nums[i]!=i+1 && nums[i]!= nums[nums[i]-1]){
               int temp=nums[i];
               nums[i]= nums[temp-1];
               nums[temp-1]= temp;               
           }
        }
        for (int i=0; i<nums.length;i++){
            if (nums[i]!=i+1)
                result.add(i+1);
        }
        return result;
    }
}