class Solution {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int max=0 , buy=prices[0];

        for(int i=1;i<len;i++){
            if(prices[i]>buy){
                max=Math.max(max,prices[i]-buy);
            }
            buy = Math.min(buy,prices[i]);
        }
        
        return max;
    }
}