package tyagiabhinav.leetcode;

import java.util.HashSet;
import java.util.Set;

public class K_DiffPairArray {

    public static int findPairs(int[] nums, int k) {
        int size = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < size; i++) {
            if (set.contains(Math.abs(k - nums[i]))) {
                if (!set2.contains((nums[i] + "-" + (k - nums[i]))) && !set2.contains(((k - nums[i]) + "-" + nums[i]))) {
                    set2.add(nums[i] + "-" + (k - nums[i]));
                }
            }
        }
        return set2.size();
    }

    public static int bruteFindPairs(int[] nums, int k) {
        int size = nums.length;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (!set.contains((nums[i] + "-" + nums[j])) && !set.contains((nums[j] + "-" + nums[i]))) {
                        set.add(nums[i] + "-" + nums[j]);
                    }
                }
            }
        }
        return set.size();
    }

    public static void main(String[] args) {
//        int[] arr = {3, 1, 4, 1, 5};
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {1, 3, 1, 5, 4};
        int[] arr = {1, 1, 1, 2, 1};
//        int[] arr = {1, 1, 1, 2, 2};
        System.out.println(findPairs(arr, 0));
    }
}
