package tyagiabhinav.leetcode;

public class SearchInsertPosition {

    public static int searchInsert(int[] nums, int target) {
        int size = nums.length;
        int first = 0;
        int last = size - 1;

        while (first <= last) {
            int mid = (first + last) / 2;
            if (nums[mid] < target) {
                first = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            } else {
                last = mid - 1;
            }
        }
        return first;
    }

    public static void main(String[] args) {
        int nums[] = {1};

        System.out.print(searchInsert(nums, 2));
    }
}
