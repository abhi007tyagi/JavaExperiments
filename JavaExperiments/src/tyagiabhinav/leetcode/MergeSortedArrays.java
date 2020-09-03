package tyagiabhinav.leetcode;

public class MergeSortedArrays {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1, p2 = n - 1, curr = m + n - 1;
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[curr--] = nums1[p1--];
            } else {
                nums1[curr--] = nums2[p2--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, p2 + 1);
        for (int num : nums1) {
            System.out.print(num + " ");
        }
    }

    private static int[] getMinMax(int a, int b, int max) {
        int min = 0;
        if (a < max) {
            if (a < b) {
                // a smallest
                min = a;
            } else {
                // b smallest
                min = b;
            }
        } else if (max < b) {
            // max smallest
            int temp = max;
            max = (a < b) ? b : a;
            min = temp;
        } else {
            max = a;
            min = b;
        }
        int[] res = {min, max};
        return res;
    }

    public static void main(String[] args) {
        int[] a1 = {4, 5, 6, 0, 0, 0};
        int[] a2 = {1, 2, 3};
        merge(a1, 3, a2, 3);
//        int a = 100, b = 90, max = 99;
//        int[] arr = getMinMax(a, b, max);
//        System.out.println(arr[0] + " " + arr[1]);
    }
}
