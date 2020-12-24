package tyagiabhinav.pramp;

public class NumberOfPaths {
    static int count = 0;

    static int numOfPathsToDest(int n) {
        // your code goes here
        count = 0;;
        int[][] grid = new int[n][n];
        for (int i = n - 1, k = 0; i >= 0; i--, k++) {
            for (int j = 0; j < n; j++) {
                if (j < k)
                    grid[i][j] = 1;
                else
                    grid[i][j] = 0;
            }
        }
        dfs(grid, n - 1, 0, n);
        return count;
    }

    /*
      ways[2,1] = ways[1,1] + ways[]
      ways[i,j] = ways[] + ways[]
    */
    private static void dfs(int[][] grid, int r, int c, int n) {
        if (r == 0 && c == n - 1)
            count++;
        else if (grid[r][c] == 0) {
            if (r > 0 && grid[r - 1][c] == 0) dfs(grid, r - 1, c, n); // North
            if (c < n - 1 && grid[r][c + 1] == 0) dfs(grid, r, c + 1, n); // East
        }
    }

    public static void main(String[] args) {
        System.out.println(numOfPathsToDest(1));
        System.out.println(numOfPathsToDest(2));
        System.out.println(numOfPathsToDest(3));
        System.out.println(numOfPathsToDest(4));
        System.out.println(numOfPathsToDest(5));
        System.out.println(numOfPathsToDest(6));
        System.out.println(numOfPathsToDest(7));
    }

}
