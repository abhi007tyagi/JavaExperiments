package tyagiabhinav.leetcode;

import java.util.*;

public class ReconstructItinerary {
        public List<String> findItinerary(List<List<String>> tickets) {
            Map<String, PriorityQueue> map = new HashMap<>();

            for(List<String> list: tickets){
                String start = list.get(0);
                String end = list.get(1);
                map.computeIfAbsent(start, k -> new PriorityQueue<String>((a,b) -> {return a.compareTo(b);})).add(end);
            }
            List<String> res = new ArrayList<>();
            dfs("JFK", map, res);
            return res;
        }

        private void dfs(String start, Map<String, PriorityQueue> map, List<String> res){
            PriorityQueue<String> pq = map.get(start);
            while(pq != null && !pq.isEmpty()){
                dfs(pq.poll(), map, res);
            }
            res.add(0,start);
        }
}
