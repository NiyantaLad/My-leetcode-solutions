class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=[]
        dict1={}
        if len(nums2)==len(nums1)==1:
            return nums1


        elif len(nums2)<=len(nums1):
            for i in nums1:
                dict1[i]=nums1.count(i)
            for i in nums2:
                if i in dict1 and dict1[i]!=0:
                    dict1[i]-=1
                    l.append(i)
            return l

        else: 
            for i in nums1:
                dict1[i]=nums1.count(i)
            for i in nums2:
                if i in dict1 and dict1[i]!=0:
                    dict1[i]-=1
                    l.append(i)
            return l

        

        
        
            
        