package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        int[] result;
        if(nums1.length > nums2.length){
            result = getIntersection(nums2, nums1);
        } else {
            result = getIntersection(nums1, nums2);
        }
        return result;
    }

    private static int[] getIntersection(int[] small, int[] large){
        Set<Integer> set = new HashSet<>();
        for(int n: small){
            if(bSearch(n, large)){
                set.add(n);
            }
        }
        int i=0;
        int[] res = new int[set.size()];
        for(int n: set)
            res[i++] = n;
        return res;
    }

    private static boolean bSearch(int n, int[] nums){
        int first = 0;
        int last = nums.length-1;
        while(first<last){
            int mid = (first+last)/2;
            if(nums[mid]>n){
                last = nums[mid]-1;
            } else if(nums[mid] == n){
                return true;
            } else {
                first = nums[mid]+1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] res = intersection(new int[]{1,2,3,4}, new int[]{5,6});
    }
}
