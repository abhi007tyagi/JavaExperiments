package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> spiralOrder(int[][] matrix) {
        int r = matrix.length;
        if (r == 0) return new ArrayList<>();
        int c = matrix[0].length;
        if (c == 0) return new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        boolean isRow = true;
        boolean isReverse = false;
        int counter = 0, tot = r * c;
        while (counter < tot && list.size() < tot) {
            if (!isReverse) {
                list = iterate(matrix, i, j, c, isRow, isReverse, list);
                c--; i++; isRow = !isRow; counter++;
                list = iterate(matrix, c, i, r, isRow, isReverse, list);
                r--; c--; isRow = !isRow; counter++;
                isReverse = !isReverse;
            } else {
                list = iterate(matrix, r, c, j, isRow, isReverse, list);
                r--; isRow = !isRow; counter++;
                list = iterate(matrix, j, r, i, isRow, isReverse, list);
                j++; c++; r++; isRow = !isRow; counter++;
                isReverse = !isReverse;
            }
        }
//
//        list = iterate(matrix, 0, 0, c, true, false, list);
//        list = iterate(matrix, c - 1, 1, r, false, false, list);
//
//        list = iterate(matrix, r - 1, c - 2, 0, true, true, list);
//        list = iterate(matrix, 0, r - 2, 1, false, true, list);
//
//
//        list = iterate(matrix, 1, 1, c - 1, true, false, list);
//        list = iterate(matrix, c - 2, 2, r - 1, false, false, list);
//
//        list = iterate(matrix, r - 2, c - 3, 1, true, true, list);
//
        return list;
    }

    private static List<Integer> iterate(int[][] mat, int rc, int s, int e, boolean isRow, boolean isRevers, List<Integer> list) {

        if (!isRevers) {
            for (int i = s; i < e; i++) {
                if (isRow)
                    list.add(mat[rc][i]);
                else
                    list.add(mat[i][rc]);
            }
        } else {
            for (int i = s; i >= e; i--) {
                if (isRow)
                    list.add(mat[rc][i]);
                else
                    list.add(mat[i][rc]);
            }
        }

        return list;
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {12, 13, 14, 5},
//                {11, 16, 15, 6},
//                {10, 9, 8, 7}
//        };
//        int[][] matrix = {
//                {1, 2, 3},
//                {10, 11, 4},
//                {9, 12, 5},
//                {8, 7, 6}
//        };

//        int[][] matrix = {
//                {1, 2},
//                {8, 3},
//                {7, 4},
//                {6, 5}
//        };

//        int[][] matrix = {
//                {1, 2, 3},
//                {6, 5, 4}
//        };

//        int[][] matrix = {
//                {1, 2},
//                {4, 3}
//        };

        int[][] matrix = {
                {1}
        };
        List<Integer> list = spiralOrder(matrix);
        System.out.println(list.toString());
    }
}
