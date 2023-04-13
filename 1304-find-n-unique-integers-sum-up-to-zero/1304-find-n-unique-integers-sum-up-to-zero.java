class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int i,sum=0;
        for (i=0;i<n-1;i++){
            ans[i]=i+1;
            sum=sum+ans[i];
        }
        ans[i]=-sum;
        return ans;
    }
}