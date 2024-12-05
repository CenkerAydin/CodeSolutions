package java.leetcode.easy;

//Link -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/?envType=problem-list-v2&envId=dynamic-programming

class MaxProfit {
    public int maxProfit(int[] prices) {
        int buyPrice= prices[0];
        int profit =0;

        for(int p : prices){
            if(buyPrice > p)
                buyPrice= p;

            profit = Integer.max(profit, p-buyPrice);
        }
        return profit;
    }
}
