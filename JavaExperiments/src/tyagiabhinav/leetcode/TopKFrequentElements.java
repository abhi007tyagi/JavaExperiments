package tyagiabhinav.leetcode;

import java.util.*;

public class TopKFrequentElements {
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(map::get));

        for(int key: map.keySet()){
            pq.add(key);
            if(pq.size()>k) pq.remove();
        }

        int[] list = new int[k];
        int i=0;
        while (!pq.isEmpty()) list[i++] = pq.remove();

        return list;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,2,2,3,3,3,4,5,6,7,8};
        arr = topKFrequent(arr, 3);
        for(int n: arr)
            System.out.print(n + " ");
    }
}
