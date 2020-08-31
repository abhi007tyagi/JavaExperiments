package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        int size = intervals.length;
        if (size < 2) return intervals;

        Set<Integer> scanned = new HashSet<>();
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            if (!scanned.contains(i)) {
                for (int j = i+1; j < size; j++) {
                    if (!scanned.contains(j)) {
                        if (intervals[i][1] >= intervals[j][0]) {
                            intervals[i] = new int[]{Math.min(intervals[i][0], intervals[j][0]), Math.max(intervals[i][1], intervals[j][1])};
                            scanned.add(i);
                            scanned.add(j);
                        }
                    }
                }
                list.add(intervals[i]);
            }
        }
        int[][] res = new int[list.size()][];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 6}, {2, 10}, {15, 18}};
        arr = merge(arr);
        for (int[] l : arr) {
            System.out.println(l[0] + " " + l[1]);
        }
    }
}
