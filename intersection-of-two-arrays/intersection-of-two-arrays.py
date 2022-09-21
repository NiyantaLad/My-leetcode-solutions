class Solution(object):
    def intersection(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        # if len(nums1)<=len(nums2):
        #     index=[i for i in nums1 if i in nums2]
        #     return(set(index))
        # else:
        #     index=[i for i in nums2 if i in nums1]
        #     return(set(index))
        
        hnums1=set(nums1)
        hnums2=set(nums2)
        out=[]
        for i in hnums1:
            if i in hnums2:
                out.append(i)
        return out