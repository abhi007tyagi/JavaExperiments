package tyagiabhinav.leetcode;

public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int size = prices.length;
        if (size < 2) return 0;

        int max = 0, buy = -prices[0];
        for (int i=1; i < size; i++) {
            if (buy + prices[i] > max) {
                max = buy + prices[i];
            } else {
                buy = -(Math.min(-buy, prices[i]));
            }
        }
        return max;
    }

    public static int bruteMaxProfit(int[] prices) {
        int size = prices.length;
        if (size < 2) return 0;

        int max = 0;
        for (int i = 0; i < size; i++) {
            int buy = -prices[i];
            for (int j = i + 1; j < size; j++) {
                int profit = buy + prices[j];
                max = Math.max(max, profit);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 1, 5, 2, 0, 6, 4, 3, 1};
//        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }
}
