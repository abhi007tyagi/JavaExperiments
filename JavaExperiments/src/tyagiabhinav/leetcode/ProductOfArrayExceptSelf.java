package tyagiabhinav.leetcode;

public class ProductOfArrayExceptSelf {

    public static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int prod = 1, counter = 0;
        for (int i = 0; i < size; i++) {
            if (nums[i] != 0) prod *= nums[i];
            else {
                counter++;
            }
        }

        for (int i = 0; i < size; i++) {
            if (counter > 0) {
                if (nums[i] != 0) nums[i] = 0;
                else {
                    if (counter < 2) nums[i] = prod;
                    else nums[i] = 0;
                }
            } else {
                nums[i] = prod / nums[i];
            }
        }
        return nums;
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 3, 4};
        arr = productExceptSelf(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
    }
}
