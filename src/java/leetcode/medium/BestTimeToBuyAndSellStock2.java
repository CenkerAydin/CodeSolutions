package java.leetcode.medium;

//Problem Linki -> https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/?envType=problem-list-v2&envId=dynamic-programming

public class BestTimeToBuyAndSellStock2 {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) return 0;

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1]; // Karı ekle
            }
        }

        return maxProfit; // Toplam maksimum kar
    }
}
