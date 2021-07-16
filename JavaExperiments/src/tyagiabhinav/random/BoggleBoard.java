package tyagiabhinav.random;

import java.util.*;

public class BoggleBoard {

    private static boolean isValid(String s){
        Set<String> words = new HashSet<>();
        words.add("apple");
        words.add("cat");
        words.add("dog");
        words.add("boy");
        words.add("caty");
        words.add("oyo");
        words.add("atyo");
        words.add("god");

        return words.contains(s);
    }

    private static Set<String> result = new HashSet<>();
    private static List<String> getList(char[][] input){
        Map<String, String> map = new HashMap<>();
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                bfs(input, i, j, map);
            }
        }
        return new ArrayList<>(result);
    }

    private static void bfs(char[][] input, int i, int j, Map<String, String> map){
        Queue<Cell> q = new LinkedList<>();
        q.add(new Cell(i, j, ""+input[i][j], new HashSet<>()));
        int[][] dir = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            Cell cell = q.poll();
            if(isValid(cell.val)){
//                System.out.println(cell.val);
                result.add(cell.val);
            }
            if(cell.seen.size() >= 16){
                break;
            }
            for(int[] d: dir){
                int x = cell.x + d[0];
                int y = cell.y + d[1];
                if(x>=0 && x<4 && y>=0 && y<4 && cell.seen.add(x+"-"+y)){
                    String val = cell.val + input[x][y];
                    q.add(new Cell(x, y, val, new HashSet<>(cell.seen)));
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] words = new char[][]{
                {'a', 'p', 'p', 'l'},
                {'c', 'b', 'o', 'e'},
                {'a', 't', 'y', 'l'},
                {'c', 'g', 'o', 'd'}};
        List<String> res = getList(words);
        for(String s: res){
            System.out.println(s);
        }

    }

    static class Cell{
        int x;
        int y;
        String val;
        Set<String> seen;

        Cell(int x, int y, String v, Set<String> s){
            this.x = x;
            this.y = y;
            this.val = v;
            this.seen = s;
        }
    }
}
