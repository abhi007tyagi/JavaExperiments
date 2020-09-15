package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordSerach {
    public static boolean exist(char[][] board, String word) {
        int r = board.length;
        if (r == 0) return false;
        int c = board[0].length;

        Map<Character, Integer> freMap = new HashMap<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                freMap.put(board[i][j], freMap.getOrDefault(board[i][j], 0) + 1);
            }
        }

        Map<Character, Integer> wMap = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(!freMap.containsKey(ch)) return false;
            wMap.put(ch, wMap.getOrDefault(ch, 0) + 1);
            if(wMap.get(ch) > freMap.get(ch)) return false;
        }
        return true;
    }

    public static void main(String[] args) {

    }
}
