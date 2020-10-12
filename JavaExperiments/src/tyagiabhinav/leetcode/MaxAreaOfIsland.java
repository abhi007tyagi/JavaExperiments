package tyagiabhinav.leetcode;


import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class MaxAreaOfIsland {
    public int maxAreaOfIsland(int[][] grid) {
        int r = grid.length-1;
        int c = (r>=0) ? grid[0].length-1: 0;
        if(r<0 || c<0) return 0;
        int max = 0;
        for(int i=0; i<=r; i++){
            for(int j=0; j<=c; j++){
                if(grid[i][j] == 1){
                    max = Math.max(max, dfs(grid,i,j,r,c, 0));
                }
            }
        }
        return max;
    }

    private int dfs(int[][]M, int i, int j, int r, int c, int count){
        if(i<0 || j<0 || i>r || j>c || M[i][j] == 0) return count;
        M[i][j] = 0;
        count++;
        count = dfs(M,i-1,j,r,c,count); // top
        count = dfs(M,i+1,j,r,c,count); // bottom
        count = dfs(M,i,j-1,r,c,count); // left
        count = dfs(M,i,j+1,r,c,count); // right

        return count;
    }

    private static int getDiff(String a, String b){
        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(b.indexOf(a.charAt(i)) == -1) count++;
            if(count > 1) return count;
        }
        return count;
    }

    public static void main(String[] args) {
        String A = "abcdefgh";
        String B = "izcdefgh";

        System.out.println(getDiff(A, B));
    }


}
