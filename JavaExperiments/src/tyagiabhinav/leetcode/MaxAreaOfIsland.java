package tyagiabhinav.leetcode;

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
}
