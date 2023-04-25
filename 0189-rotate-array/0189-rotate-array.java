class Solution {
    public void rotate(int[] nums, int k) {  
        k = k % nums.length;
        int n= nums.length;
        reverse (nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    
    void reverse(int[] nums, int start, int end ){
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }  
    }
//time limit exceeded
//         for (int i = 0; i < k; i++)   {
//             int n = nums.length; 
//             rotateArrayByOne(nums, n);      
//         }    
//     }
    
//     public static void rotateArrayByOne(int nums[], int n)   
//         {   
//             int i, temp;   
//             //temporary array to store the newly created array  
//             temp = nums[n - 1];   
//             for (i = n-1; i > 0; i--)   
//             //shifts array element to the left by 1  
//             nums[i] = nums[i - 1];       
//             nums[0] = temp; 
//         }
}