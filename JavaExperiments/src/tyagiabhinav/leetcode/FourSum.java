package tyagiabhinav.leetcode;

import java.util.*;

public class FourSum {

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int size = nums.length;
        if (size < 4) return new ArrayList<>();
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();
        for (int r = 0; r < size - 3; r++) {
            for (int i = r + 1; i < size - 2; i++) {
                int j = i + 1;
                int k = size - 1;
                while (j < k) {
                    int sum = nums[r] + nums[i] + nums[j] + nums[k];
                    if (sum == target) {
                        set.add(Arrays.asList(nums[r], nums[i], nums[j++], nums[k--]));
                    } else if (sum > target) {
                        k--;
                    } else {
                        j++;
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, -1, 0, -2, 2};
        System.out.println(fourSum(arr, 0));
    }
}
