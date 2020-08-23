package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        private static int[] bruteForceTwoSum(int[] nums, int target) {
            int a = -1;
            int b = -1;
            for(int i=0; i<nums.length; i++){
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]+nums[j] == target){
                        a = i;
                        b = j;
                        break;
                    }
                }
                if(a != -1 && b != -1){
                    break;
                }
            }
            return new int[] {a,b};
        }

    private static int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> map = new HashMap<>();
            for(int i=0; i<nums.length; i++){
                map.put(nums[i], i);
            }
            for(int i=0; i<nums.length; i++){
                int chk = target-nums[i];
                if(map.containsKey(chk) && map.get(chk) != i){
                    return new int[]{map.get(chk), i};
                }
            }
            throw new IllegalArgumentException("No solution!");
    }

    public static void main(String[] args) {
            int[] arr = {2,7,11,15,0,6,13,8};
            int[] res1 = bruteForceTwoSum(arr, 2);
            int[] res2 = twoSum(arr, 2);
            System.out.println(res1[0]+" "+res1[1]);
            System.out.println(res2[0]+" "+res2[1]);
    }
}
