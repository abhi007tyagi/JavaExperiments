package tyagiabhinav.leetcode;

public class BestTimeBuySellStockII {

    public static int maxProfit(int[] prices) {
        int size = prices.length;
        if (size < 2) return 0;
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (prices[i] > prices[i - 1]) {
                max += (prices[i] - prices[i - 1]);
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] arr = {7, 1, 1, 5, 2, 0, 6, 4, 3, 1};
//        int[] arr = {7, 6, 4, 3, 1};
//        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1, 7, 2, 3, 6, 7, 6, 7};
//        int[] arr = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr));
    }
}
