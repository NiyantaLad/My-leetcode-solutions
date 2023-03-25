class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i,j;
        if(m>0 && n>0){
            for ( i=0,j=0;i<nums1.length;i++){
                if (nums1[i]==0 && n!=0){
                    nums1[i]=nums2[j];
                    j++;
                    n--;
                }
            }
            Arrays.sort(nums1);
        }
        if (m==0 && n>0){
             i=0;
             j=0;
            while(i!=n){
                nums1[i]=nums2[i];
                i++;
                j++;
            }
        }
    }
}