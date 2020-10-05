package tyagiabhinav.leetcode;

public class FriendCircle {

    public static int findCircleNum(int[][] M) {
        int r = M.length-1;
        int c = (r>=0) ? M[0].length-1: 0;
        if(r<0 || c<0) return 0;
        int count = 0;
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                if(M[i][j] == 1){
                    count++;
                    dfs(M,i,j,r,c);
                }
            }
        }
        return count;
    }

    private static void dfs(int[][]M, int i, int j, int r, int c){
        if(i<0 || j<0 || i>r || j>c || M[i][j] == 0) return;
        M[i][j] = 0;
        dfs(M,i-1,j,r,c); // top
        dfs(M,i+1,j,r,c); // bottom
        dfs(M,i,j-1,r,c); // left
        dfs(M,i,j+1,r,c); // right
    }

    public static void main(String[] args) {

    }
}
