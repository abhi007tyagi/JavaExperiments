package tyagiabhinav.leetcode;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        if (k > size) k = k % size;
        int[] copy = Arrays.copyOf(nums, size);
        for(int i=0; i<size; i++) {
            if (k == size)
                k = 0;
            nums[k++] = copy[i];
        }
        for(int n: nums){
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 15);
    }
}
