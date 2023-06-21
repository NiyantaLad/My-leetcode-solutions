class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if(flowerbed.length==1 && flowerbed[0]==0) return true;
        int prev=0,count=0;
        for (int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==0){
                if(prev==0 && flowerbed[i+1]==0){
                    flowerbed[i]=1;
                    count++;
                }
                else if(i==flowerbed.length-2 && prev==1 && flowerbed[i+1]==0){
                    flowerbed[i+1]=1;
                    count++;
                }                    
            }
            prev=flowerbed[i];
        }
            if(count>=n)
                return true;
            else
                return false;
        
    }
}
