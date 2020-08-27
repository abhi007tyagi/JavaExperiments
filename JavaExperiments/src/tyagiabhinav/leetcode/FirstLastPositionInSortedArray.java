package tyagiabhinav.leetcode;

public class FirstLastPositionInSortedArray {

    public static int binary(int[] nums, int key, boolean isMin) {
        int size = nums.length;
        int first = 0;
        int last = size - 1;

        int mid = (first + last) / 2;
        while (first <= last) {
            if (nums[mid] < key) {
                first = mid + 1;
            } else if (!isMin && nums[mid] == key && mid != size - 1 && nums[mid] != nums[mid + 1]) {
                return mid;
            } else if (!isMin && nums[mid] == key && mid == size - 1) {
                return mid;
            } else if (!isMin && nums[mid] == key && mid != size - 1 && nums[mid] == nums[mid + 1]) {
                first = mid + 1;
            } else if (isMin && nums[mid] == key && mid != 0 && nums[mid] != nums[mid - 1]) {
                return mid;
            } else if (isMin && nums[mid] == key && mid == 0) {
                return mid;
            } else if (isMin && nums[mid] == key && mid != 0 && nums[mid] == nums[mid - 1]) {
                last = mid - 1;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return -1;
    }

    public static int[] searchRange(int[] nums, int target) {
        int min = binary(nums, target, true);
        int max = binary(nums, target, false);

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        int nums[] = {6};

        int[] res = searchRange(nums, 6);
        for(int i = 0; i< res.length; i++){
            System.out.print(res[i]+", ");
        }

    }
}
