class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        hashset=set() 
        for i in nums: 
            if i not in hashset:
                hashset.add(i)
            else:
                hashset.remove(i)
        for i in hashset:
            return (i)
       
        
            
                
        
        