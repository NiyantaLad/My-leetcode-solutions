class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] result=new int [nums.length];
        int start=0;
        int end=nums.length-1;
        int resIndex=nums.length-1;
        
        while(start<=end){
            if ((nums[start]*nums[start]) > (nums[end]*nums[end])){
                result[resIndex--]=(nums[start]*nums[start]);
                start++;
            }
            else {    
                result[resIndex--]=(nums[end]*nums[end]);
                end--;
            }
        }
        return result;
    }
}