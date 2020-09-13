package tyagiabhinav.leetcode;

import java.util.*;

public class HighFive {
    public static int[][] highFive(int[][] items) {
        if(items.length == 0) return new int[][]{};
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for(int[] n: items){
            PriorityQueue<Integer> pq = map.getOrDefault(n[0], new PriorityQueue<>());
            pq.add(n[1]);
            if(pq.size()>5) pq.remove();
            map.put(n[0],pq);
        }

        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()){
            int key = entry.getKey();
            PriorityQueue<Integer> pq = entry.getValue();
            int sum = 0;
            while(!pq.isEmpty()){
                sum += pq.remove();
            }
            list.add(new int[]{key, sum/5});
        }

        return list.toArray(new int[list.size()][]);

    }

    public static void main(String[] args) {
    }
}
