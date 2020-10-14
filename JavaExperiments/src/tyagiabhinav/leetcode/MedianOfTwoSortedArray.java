package tyagiabhinav.leetcode;

import java.util.LinkedHashMap;

public class MedianOfTwoSortedArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double mid1 = getMid(nums1);
        double mid2 = getMid(nums2);
        double res = 0.0;
        if(mid1 != 0.0 && mid2 != 0.0) res = (mid1 + mid2)/2;
        else if(mid1 == 0.0 && mid2 != 0.0) res = mid2;
        else if(mid1 != 0.0 && mid2 == 0.0) res = mid1;
        return res;
    }

    private static double getMid(int[] nums){
        int size = nums.length;
        if (size == 0) return 0;
        if (size == 1) return (double) nums[0];
        if (size == 2) return (double) (nums[0]+nums[1])/2;
        if (size%2 == 0) return (double) (nums[(size/2)-1] + nums[size/2])/2;
        else return (double) nums[size/2];
    }

    public static void main(String[] args) {
        int[] arr1 = {1,200,201,300,457}; //231.8
        int[] arr2 = {2,39,67,69,79,87,101}; // 63.4
        System.out.println(findMedianSortedArrays(arr1, arr2));
    }


    class LRUCache extends LinkedHashMap<Integer, Integer>{

        public LRUCache(int initialCapacity, float loadFactor, boolean accessOrder) {
            super(initialCapacity, loadFactor, accessOrder);
        }
    }

}
