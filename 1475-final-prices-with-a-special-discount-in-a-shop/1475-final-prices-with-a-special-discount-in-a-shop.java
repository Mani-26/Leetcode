class Solution {
    public int[] finalPrices(int[] prices) {
        int n=prices.length;
        for(int i=0;i<n-1;i++){
            prices[i]-=findMin(i,prices);
        }
        return prices;
    }
    private int findMin(int start,int[] prices){
        int disc=0;
        int n=prices.length;
        for(int i=start+1;i<n;i++){
            if(prices[start]>=prices[i]){
                return prices[i];
            }
        }
        return disc;
    }
}