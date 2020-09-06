package tyagiabhinav.leetcode;

import java.util.*;

public class MergeIntervals {

    public static int[][] merge(int[][] intervals) {
        int size = intervals.length;
        if (size < 2) return intervals;
        Collections.sort(Arrays.asList(intervals), new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return (a[0] < b[0]) ? -1 : (a[0] == b[0]) ? 0 : 1;
            }
        });

        List<int[]> list = new ArrayList<>();
        int j=1;
        int[] temp = intervals[0];
        while(j<size){
            int x = Math.max(temp[0], intervals[j][0]);
            int y = Math.min(temp[1], intervals[j][1]);
            if(x<=y){
                temp = new int[]{Math.min(temp[0], intervals[j][0]), Math.max(temp[1], intervals[j][1])};
                j++;
            } else {
                list.add(temp);
                temp = intervals[j++];
            }
        }
        list.add(temp);
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {4, 5}};
        arr = merge(arr);
        for (int[] n : arr) {
            System.out.print("[" + n[0] + " " + n[1] + "]");
        }
    }
}
