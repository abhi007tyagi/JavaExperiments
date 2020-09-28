package tyagiabhinav.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class PrefixSum {
    public static int subarraySum(int[] nums, int k) {
        if (nums.length == 0) return 0;
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum == 7) count++;

            count += map.getOrDefault(sum - k, 0);

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 6, -3, 10, -3};
        System.out.println(subarraySum(arr, 7));

        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> (o2>o1)?-1:(o2==o1)?0:1);
    }

}
