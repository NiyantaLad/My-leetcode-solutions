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
                    # while dict1[i]!=  0:
                    dict1[i]-=1
                    l.append(i)
            return l

        else: #nums1<nums2  4:0 9:0 5:1 94984 94
            for i in nums1:
                dict1[i]=nums1.count(i)
            for i in nums2:
                if i in dict1 and dict1[i]!=0:
                    # while dict1[i]!= 0:
                    dict1[i]-=1
                    l.append(i)
            return l
        # if len(nums1)<=len(nums2):
        #     return ([i for i in nums1 if i in nums2 ])
        # elif len(nums2)<len(nums1):
        #     return ([i for i in nums1 if i in nums2 ])
        
#         if(nums1==nums2):
#             return nums1
#         dict={}
#         l=[]
        
        
#         for i in nums1:
#             if i not in dict:
#                 dict[i]=(nums1.count(i))
#         for i in nums2:
#             if i in dict:
#                 if dict[i]<=nums2.count(i):
#                     l.append (i)
        
        
#         print(dict)
#         return(l)
        # print(nums1.count(1))
    
        # if len(nums1) > len(nums2): return self.intersect(nums2, nums1)
        # cnt = Counter(nums1)
        # ans = []
        # for x in nums2:
        #     if cnt[x] > 0:
        #         ans.append(x)
        #         cnt[x] -= 1
        # return ans
        
        
            
        