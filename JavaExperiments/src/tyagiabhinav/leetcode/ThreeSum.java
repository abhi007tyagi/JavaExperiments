package tyagiabhinav.leetcode;

import java.util.*;

public class ThreeSum {
    private static List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3){
            return new ArrayList<>();
        }
        Arrays.sort(nums);
        int size = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < size-2; i++) {
            int j=i+1;
            int k=size-1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if(sum > 0){
                    k--;
                } else {
                    j++;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr).toString());
    }

}
