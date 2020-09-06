package tyagiabhinav.leetcode;

import java.util.*;

public class IntervalListIntersection {

    public static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;
        List<int[]> list = new ArrayList<>();
        while (i < A.length && j < B.length) {
            int x = Math.max(A[i][0], B[j][0]);
            int y = Math.min(A[i][1], B[j][1]);
            if (x <= y) list.add(new int[]{x, y});
            if (A[i][1] < B[j][1]) i++;
            else j++;
        }
        return list.toArray(new int[list.size()][]);
    }

    private static int[] getIntersection(int[] a, int[] b) {
        int[] res = {-1, -1};
        if (b[0] > a[1] || a[0] > b[1]) {
            return new int[]{};
        } else {

            res[0] = Math.max(a[0], b[0]);
            res[1] = Math.min(a[1], b[1]);
            return res;
        }
    }

    public static void main(String[] args) {
//        int[][] A = {{0, 2}, {5, 10}, {13, 23}, {24, 25}};
//        int[][] B = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
//
////        System.out.print(A[1][0] < B[0][0]);
//        int[][] res = intervalIntersection(A, B);
//
//        for (int[] n : res) {
//            System.out.print("[" + n[0] + " " + n[1] + "]");
//        }

        int[] arr = {2,4,1,3,8,5,6,7};
        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o1>o2)?-1:(o1==o2)?0:1;
            }
        });
        for(int n: arr){
            pq.add(n);
        }

        while(!pq.isEmpty()){
            System.out.println(pq.remove());
        }

//        int[] a = {0, 1};
//        int[] b = {1, 3};
//
//        int[] res = getIntersection(a, b);
//        System.out.println(res[0] + " " + res[1]);
    }
}
