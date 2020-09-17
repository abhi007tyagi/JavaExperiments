package tyagiabhinav.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementI {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums2.length == 0) return new int[]{};
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        stack.push(nums2[0]);
        for (int i = 1; i < nums2.length; i++) {
            while(!stack.isEmpty() && stack.peek() < nums2[i]){
                map.put(stack.pop(), nums2[i]);
            }
            stack.push(nums2[i]);
        }
        while(!stack.isEmpty()){
            map.put(stack.pop(), -1);
        }

        int[] res = new int[nums1.length];
        for (int k = 0; k < nums1.length; k++) {
            res[k] = map.get(nums1[k]);
        }
        return res;
    }

    public static int[] myNextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        int i = 0;
        while (i < nums2.length) {
            int j = i + 1;
            while (j < nums2.length && nums2[i] >= nums2[j]) {
                j++;
            }
            map.put(nums2[i++], (j == nums2.length) ? -1 : nums2[j]);
        }
        int[] res = new int[nums1.length];
        for (int k = 0; k < nums1.length; k++) {
            res[k] = map.get(nums1[k]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr1 = {4, 2}, arr2 = {1, 2, 0, 4, 3, 5};
        System.out.println(Arrays.toString(nextGreaterElement(arr1, arr2)));
    }
}
