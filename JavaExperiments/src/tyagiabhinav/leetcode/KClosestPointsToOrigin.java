package tyagiabhinav.leetcode;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {

    public static int[][] kClosest(int[][] points, int K) {

        int size = points.length;
        if (size < K) return points;

        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] num1, int[] num2) {
                double dist1 = Math.sqrt(num1[0] * num1[0] + num1[1] * num1[1]);
                double dist2 = Math.sqrt(num2[0] * num2[0] + num2[1] * num2[1]);
                return Double.compare(dist2, dist1);
            }
        });

        for (int i = 0; i < size; i++) {
            pq.add(points[i]);
            if (pq.size() > K) pq.remove();
        }

        int[][] res = new int[K][];
        for (int i = 0; i < K; i++) {
            res[i] = pq.remove();
        }
        return res;
    }

    public static void main(String[] args) {
//        PriorityQueue<Integer> pq = new PriorityQueue<>();
//        for (int i = 0; i < 200; i++) {
//            pq.add(i + 100);
//            if (pq.size() > 5) pq.remove();
//        }

//        int[][] arr = {{3, 3}, {5, -1}, {-2, 4}};
        int[][] arr = {{1, 3}, {-2, 2}};
        arr = kClosest(arr, 1);
        for (int[] i : arr) {
            System.out.print("[" + i[0] + " " + i[1] + "] ");
        }
    }


}
