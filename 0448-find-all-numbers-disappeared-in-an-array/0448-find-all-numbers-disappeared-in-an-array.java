class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        
        int[] count = new int[nums.length];
        for (int i=0; i<nums.length;i++){
            count[nums[i]-1]=nums[i];
        }        
        for (int j =0; j<count.length;j++){
            if (count[j]==0)
                result.add(j+1);                
        }
        return result;
    }
}