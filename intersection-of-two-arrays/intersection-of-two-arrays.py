class Solution:
    def intersection(self, nums1: List[int], nums2: List[int]) -> List[int]:
        hnums1=set(nums1)
        hnums2=set(nums2)
        out=[]
        for i in hnums1:
            if i in hnums2:
                out.append(i)
        return out
        