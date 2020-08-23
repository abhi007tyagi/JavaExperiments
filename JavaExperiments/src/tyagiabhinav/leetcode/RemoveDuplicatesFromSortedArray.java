package tyagiabhinav.leetcode;

public class RemoveDuplicatesFromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int size = nums.length;
        if (size < 2) {
            return size;
        }
        int prev = nums[0], index = 1;

        for (int i = 1; i < size; i++) {
            int curr = nums[i];
            if (prev != curr) {
                nums[index++] = curr;
                prev = curr;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(removeDuplicates(arr));
    }
}
