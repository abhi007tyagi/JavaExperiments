package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) return new int[]{i + 1, j + 1};
            if ((numbers[i] + numbers[j] > target)) j--;
            else i++;
        }
        return new int[]{};
    }


    public static int[] slowTwoSum(int[] numbers, int target) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            if (numbers[i] + numbers[i + 1] == target) {
                return new int[]{i + 1, i + 2};
            }
            int j = binary(numbers, i + 1, size - 1, target - numbers[i]);
            if (j > -1) {
                return new int[]{i + 1, j + 1};
            }
        }
        return new int[]{};
    }

    private static int binary(int[] nums, int l, int h, int k) {
        int mid = (l + h) / 2;
        while (l < h) {
            if (nums[mid] == k) {
                return mid;
            } else if (nums[mid] > k) {
                h = mid--;
            } else {
                l = mid++;
            }
        }
        return -1;
    }

    public static int[] bruteTwoSum(int[] numbers, int target) {
        int size = numbers.length;
        Map<Integer, Integer> map = new HashMap<>(size);
        for (int i = 0; i < size; i++) {
            map.put(numbers[i], i + 1);
        }

        for (int i = 0; i < size; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{i + 1, map.get(target - numbers[i])};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        arr = twoSum(arr, 26);

        System.out.println(arr[0] + " " + arr[1]);

    }
}
