package tyagiabhinav.leetcode;

public class SubarraySumEqualK {

    public static int subarraySum(int[] nums, int k) {
        int size = nums.length;
        int count = 0, sum = nums[0];

        for (int i = 0; i < size; i++) {
            if (i != 0 && sum + nums[i] > k)
                sum = nums[i];
            else if (i != 0 && sum < k)
                sum += nums[i];
            if (sum == k) {
                count++;
                if (i < size - 1 && nums[i + 1] != 0)
                    sum = nums[i];
            }
        }
        return count;
    }

    public static int bruteForceSubarraySum(int[] nums, int k) {
        int size = nums.length;
        int count = 0;

        for (int i = 0; i < size; i++) {
            int sum = nums[i];
            for (int j = i; j < size; j++) {
                if (j != i) sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 3, 0, 4};
        System.out.println(subarraySum(arr, 3));
    }
}
