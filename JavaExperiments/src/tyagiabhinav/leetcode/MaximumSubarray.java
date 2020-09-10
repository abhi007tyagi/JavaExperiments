package tyagiabhinav.leetcode;

public class MaximumSubarray {


    public static int maxSubArray(int[] nums) {
        int size = nums.length, max = nums[0];
        for(int i = 1; i < size; ++i) {
            if (nums[i - 1] > 0) nums[i] += nums[i - 1];
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public static int greedyMaxSubArray(int[] nums) {
        int size = nums.length;
        int temp = nums[0], max = nums[0];

        for (int i = 1; i < size; i++) {
            temp = Math.max(nums[i], temp + nums[i]);
            max = Math.max(max, temp);
        }
        return max;
    }

    public static int bruteMaxSubArray(int[] nums) {
        int size = nums.length;
        if (size == 0) return 0;
        if (size == 1) return nums[0];

        int max = Integer.MIN_VALUE, sum = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i; j < size; j++) {
                sum += nums[j];
                if (sum > max) {
                    max = sum;
                }
            }
            sum = 0;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4, -2, -1, 9, 7, 2, 0, 9};
//        int[] arr = {Integer.MIN_VALUE + 1};
        System.out.println(maxSubArray(arr));
    }
}
