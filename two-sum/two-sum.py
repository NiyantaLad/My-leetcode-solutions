class Solution(object):
    def twoSum(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        hashmap={}
        for i,j in enumerate(nums):
            if target-nums[i] in hashmap:
                return ([hashmap[target-j],i])
            hashmap[j]=i  
        