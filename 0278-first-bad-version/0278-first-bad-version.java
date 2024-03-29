/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        
        //time limit exceeded
        
        // for (int i=0; i<n;i++){
        //     if ((isBadVersion(i))==true)
        //         return i;
        // }
        // return n;
        
        
        //binary search
        
        int left=1;
        int right= n;
        
        while(left<right){
            int mid= left+(right-left)/2;
            if((isBadVersion(mid))==true)
                right=mid;
            else
                left=mid+1;
        }
        return right;
    }
}