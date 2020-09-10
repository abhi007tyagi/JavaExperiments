package tyagiabhinav.leetcode;

public class MoveZeros {
    public static void moveZeroes(int[] nums) {
        int size = nums.length;
        int i = 0, j = 1;
        while (j < size) {
            if (nums[i] == 0 && nums[j] != 0) {
                nums[i++] = nums[j];
                nums[j] = 0;
            } else if (nums[i] != 0) i++;
            j++;
        }

        for (int n : nums) {
            System.out.print(" " + n + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 3, 12, 1};
        moveZeroes(arr);
        arr = new int[]{1, 0, 0, 0, 12};
        moveZeroes(arr);
        arr = new int[]{2, 1, 0, 3, 12, 0, 1, 0, 5, 7, 0, 9};
        moveZeroes(arr);

    }
}
