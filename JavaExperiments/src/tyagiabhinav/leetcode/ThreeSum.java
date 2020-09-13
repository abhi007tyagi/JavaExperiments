package tyagiabhinav.leetcode;

import java.util.*;

public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        int i = 0, j = nums.length - 1;
        Set<List<Integer>> set2 = new HashSet<>();
        while (i < j) {
            if (set.contains(nums[i] + nums[j])) {
                set2.add(Arrays.asList(nums[i], nums[j], nums[i] + nums[j]));
                i++; j--;
            } else if (nums[i] + nums[j] > 0) j--;
            else i++;
        }
        return new ArrayList<>(set2);
    }

    private static List<List<Integer>> bruteThreeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < size - 2; i++) {
            int j = i + 1;
            int k = size - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > 0) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(arr).toString());
    }

}
