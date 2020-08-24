package tyagiabhinav.leetcode;

public class RemoveElements {

    public static int removeElement(int[] nums, int val) {
//        int size = nums.length;
//        if (size == 0) return 0;
//        if (size == 1 && nums[0] != val) return 1;
//        if (size == 1 && nums[0] == val) return 0;
//
//        int index = -1;
//        for (int i = 0; i < size; i++) {
//            int curr = nums[i];
//            if (curr == val && index == -1) index = i;
//            else if (index != -1 && curr != val)
//                nums[index++] = curr;
//        }
//        return (index == -1) ? size : index;

        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 3, 2};
        System.out.println(removeElement(arr, 2));
    }
}
