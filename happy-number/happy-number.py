class Solution:
    def isHappy(self, n: int) -> bool:        
        hashset=set()
        while (n>0):
            sq=0
            for i in iter (str(n)):
                sq+=int(i)**2
            n=sq
            if (n==1):
                return True
            else:
                if n not in hashset:
                    hashset.add(n)
                    continue
                else:
                    return False

            

        
        
        