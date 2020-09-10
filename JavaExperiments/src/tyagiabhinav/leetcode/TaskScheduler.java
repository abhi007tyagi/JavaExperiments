package tyagiabhinav.leetcode;

import java.util.*;

public class TaskScheduler {
//    public static int leastInterval(char[] tasks, int n) {
//        Map<Character, Integer> map = new HashMap<>();
//        for(char ch : tasks){
//            if(map.containsKey(ch)){
//                map.put(ch, map.get(ch) + 1);
//            } else {
//                map.put(ch, 1);
//            }
//        }
//
//        Set<Character> set = map.keySet();
//        List<Character> list = new ArrayList<>();
//        int i=0, prev = '.', pprev = '*';
//        while(!set.isEmpty()){
//
//            int freq = map.get();
//        }
//    }

    public static void main(String[] args) {

        char[] arr = {'A', 'A', 'A', 'A', 'B', 'C','D', 'D',};
        PriorityQueue<Character> pq = new PriorityQueue<>();
        for(char ch: arr){
            pq.add(ch);
        }

        while (!pq.isEmpty()){
            System.out.println(pq.remove());
        }

    }
}
