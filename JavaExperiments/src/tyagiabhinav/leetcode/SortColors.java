package tyagiabhinav.leetcode;

public class SortColors {

    public static int[] sortColors(int[] nums) {
        int i = 0, j = nums.length - 1, t, curr = 0;
        while (curr <= j) {
            if (nums[curr] == 0) {
                t = nums[i];
                nums[i++] = nums[curr];
                nums[curr++] = t;
            } else if (nums[curr] == 2) {
                t = nums[curr];
                nums[curr] = nums[j];
                nums[j--] = t;
            } else {
                curr++;
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {2, 0, 2, 1, 1, 0, 2, 1, 0};
        arr = sortColors(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
