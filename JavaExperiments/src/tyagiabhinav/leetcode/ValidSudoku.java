package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        List<Set<Character>> colSets = fillList(new ArrayList<>(9));
        List<Set<Character>> gridSets = fillList(new ArrayList<>(9));

        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                Set<Character> rowSet = new HashSet<>(9);
                char ch = board[row][col];
                if (ch != '.') {
                    if (rowSet.contains(ch)) return false;
                    else rowSet.add(ch);

                    Set<Character> colSet = colSets.get(col);
                    if (colSet.contains(ch)) return false;
                    else {
                        colSet.add(ch);
                        colSets.set(col, colSet);
                    }

                    int grid = -1;
                    if (row < 3 && col < 3) grid = 0;
                    if (row < 3 && col >= 3 && col < 6) grid = 1;
                    if (row < 3 && col >= 6 && col < 9) grid = 2;
                    if (row >= 3 && row < 6 && col < 3) grid = 3;
                    if (row >= 3 && row < 6 && col >= 3 && col < 6) grid = 4;
                    if (row >= 3 && row < 6 && col >= 6 && col < 9) grid = 5;
                    if (row >= 6 && row < 9 && col < 3) grid = 6;
                    if (row >= 6 && row < 9 && col >= 3 && col < 6) grid = 7;
                    if (row >= 6 && row < 9 && col >= 6 && col < 9) grid = 8;

                    Set<Character> gridSet = gridSets.get(grid);
                    if (gridSet.contains(ch)) return false;
                    else {
                        gridSet.add(ch);
                        gridSets.set(grid, gridSet);
                    }
                }
            }
        }
        return true;
    }

    private static List<Set<Character>> fillList(List<Set<Character>> list) {
        for (int i = 0; i < 9; i++) {
            Set<Character> set = new HashSet<>(9);
            list.add(set);
        }
        return list;
    }

    public static void main(String[] args) {

    }
}
