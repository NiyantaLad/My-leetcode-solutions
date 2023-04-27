class Solution {
    public int maxProfit(int[] prices) {

        // int max=0;
        // for (int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         if (prices[j]>prices[i] && prices[j]-prices[i] > max)
        //             max=prices[j]-prices[i];
        //     }
        // }
        // return max;          //time limit exceeded (brute force)



        int l=0;
        int r=1;
        int maxP=0;
        int profit=0;

        while(r<prices.length){        //profitable?
            if(prices[l]<prices[r]){        //profit
                profit=prices[r]-prices[l];
                maxP= Math.max(maxP,profit);
            }
            else
                l=r; 
            r++;
        }
        return maxP;
    }
}