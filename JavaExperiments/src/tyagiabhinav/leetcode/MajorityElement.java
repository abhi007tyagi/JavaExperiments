package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        int max = 0;
        int res = -1;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums) {
            int f = freq.getOrDefault(n, 0) + 1;
            if(f > max){
                max = f;
                res = n;
            }
            freq.put(n, f);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(arr));
    }
}
