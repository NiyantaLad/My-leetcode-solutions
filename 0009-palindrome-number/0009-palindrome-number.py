class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return False
        
        reversed=0
        original=x
        remainder=0
        
        while (x!=0):
            remainder= x%10
            reversed= reversed * 10 + remainder
            x//=10
            
        return original==reversed