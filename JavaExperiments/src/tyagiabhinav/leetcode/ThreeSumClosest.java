package tyagiabhinav.leetcode;

import java.util.*;

public class ThreeSumClosest {

    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int size = nums.length;
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < size-2; i++) {
            int j=i+1;
            int k=size-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if (Math.abs(target - sum) < Math.abs(diff))
                    diff = target - sum;
                if (sum < target)
                    ++j;
                else
                    --k;
            }
        }
        return target - diff;
    }

    public static void main(String[] args) {
        int[] arr = {-1,1,1,-5};
        System.out.println(threeSumClosest(arr, -1));
    }
}
