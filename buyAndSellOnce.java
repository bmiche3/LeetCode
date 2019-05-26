class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length ==0){
            return 0;
        }
        int currentMax = 0;
        int min = prices[0];
        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            currentMax = Math.max(currentMax, prices[i]-min);
        }
        return currentMax;
    }
}