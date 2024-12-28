class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int mini=prices[0];
        int profit=0;
        for(int i=1;i<n;i++){
            int cost=prices[i]-mini;
            profit=max(profit,cost);
            mini=min(mini,prices[i]);
        }
        return profit;
    }
    public int max(int a, int b){
        if(a>=b){
            return a;
        }
        else{
            return b;
        }
    }
    public int min(int a, int b){
        if(a<b){
            return a;
        }
        else{
            return b;
        }
    }
}