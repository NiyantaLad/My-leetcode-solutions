class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap={}
        for i,j in enumerate(nums):
            if target-nums[i] in hashmap:
                return ([hashmap[target-j],i])
            hashmap[j]=i                                #O(n)
            

#         for m in range (0,len(nums)):
#             for n in range (m+1,len(nums)):               
#                 if nums[m]+nums[n]==target:
#                     return([m,n])                     #O(n**2)
                                          

        
        