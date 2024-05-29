package Array;
public class BuyStock {
    public static int maxProfit(int prices[]) {
        int max_profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] > buyPrice) { // price low-> sale
                int profit = prices[i] - buyPrice;
                max_profit = Math.max(max_profit, profit);
            } else {
                buyPrice = prices[i]; // price high->buy
            }

        }
        return max_profit;
    }

    public static void main(String args[]) {
        int prices[] = { 7, 1, 5, 3, 6, 4 };
        System.out.println(maxProfit(prices));
        // output is 5 bacause we have max profit when we buy price at 1 and shell it at
        // price 6 => profit 5
    }
}
