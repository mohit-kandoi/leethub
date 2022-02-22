class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length < 2) return 0;
        
        int max = Integer.MIN_VALUE;
        int min = prices[0];
        int profit = 0;
        int ans = 0;
        for(int i = 1; i<prices.length; i++){
            if(prices[i] < min){
                min = prices[i];
                max = 0;
            }else if(prices[i] > max){
                max = prices[i];
                profit = max-min;
                if(ans < profit){
                    ans = profit;
                }
            }
        }
        // if(ans < 0) return 0;
        // else return ans;
        return ans;
    }
}