class Solution(object):
    def intersect(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: List[int]
        """
        l=[]
        dict1={}
        for i in nums1:
            # if i not in dict1:
            #    dict1[i]=nums1.count(i)
                if i not in dict1:
                    dict1[i]=1
                else:
                    dict1[i]+=1

        for i in nums2:
            if i in dict1 and dict1[i]>=1:
                dict1[i]-=1
                l.append(i)
        return l
    

        


        

        
        
            
        