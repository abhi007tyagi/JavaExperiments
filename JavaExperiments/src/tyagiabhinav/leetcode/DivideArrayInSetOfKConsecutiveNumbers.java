package tyagiabhinav.leetcode;

import java.util.*;

public class DivideArrayInSetOfKConsecutiveNumbers {
    public static boolean isPossibleDivide(int[] nums, int k) {
        if(nums.length % k != 0) return false;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int n: nums)
            map.put(n, map.getOrDefault(n,0)+1);

        while(!map.isEmpty()){
            int key = map.firstKey();
            for(int i=0; i<k; i++){
                if(map.containsKey(key)) {
                    if (map.get(key) == 1) map.remove(key);
                    else map.put(key, map.get(key) - 1);
                    key++;
                } else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        String s = "dig1 8 1 5 1";
//        System.out.println(s.indexOf(" "));
        String[] srr = {"let1 art can","let2 own kit dig","let3 art zero"};
        String[] n = {"678", "12", "234", "76"};

        System.out.println(srr[0].substring(srr[0].indexOf(" ")+1));
        System.out.println(srr[1].substring(srr[1].indexOf(" ")+1));
        System.out.println(srr[2].substring(srr[2].indexOf(" ")+1));
        List<String> list1 = new LinkedList<>();
        for(String s: n){
            list1.add(s);
        }

        List<String> list2 = new LinkedList<>();
        for(String s: srr){
            list2.add(s);
        }
        Collections.sort(list2, (s1, s2) -> s1.substring(s1.indexOf(" ")+1).compareTo(s2.substring(s2.indexOf(" ")+1)));

//        Queue<String> pq = new PriorityQueue<>(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                System.out.println(o2+"--"+o1+"  :: "+o2.compareTo(o1));
//                return o2.compareTo(o1);
//            }
//        });
        list2.addAll(list1);
        for(String s: list2){
            System.out.println(s);
        }
    }
}
