package tyagiabhinav.pramp;

import java.io.*;
import java.util.*;

public class WordCountEngine {

    // [practice, makes, perfect]
    //
    // treemap -- key word, value occurance
    static String[][] wordCountEngine(String document) {
        // your code goes here
        String[] str = document.toLowerCase().split(" ");
        for (int i = 0; i < str.length; i++) {
            str[i] = str[i].replaceAll("[^a-z]", "");
        }

        HashMap<String, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            if (!indexMap.containsKey(s))
                indexMap.put(s, i);
        }

        HashMap<String, Integer> freq = new HashMap<>();
        for (String s : str) {
            freq.put(s, freq.getOrDefault(s, 0) + 1);
        }

        List<Map.Entry<String, Integer>> list = new LinkedList<>(freq.entrySet());

        Collections.sort(list, (a, b) -> {
//            int aa = a.getValue();
//            int bb = b.getValue();
//            int ans;
//            if(bb == aa){
//                ans = indexMap.get(a.getKey()) - indexMap.get(b.getKey());
//            } else {
//                ans = bb-aa;
//            }
//            return ans;
            return (b.getValue() == a.getValue())?(indexMap.get(a.getKey()) - indexMap.get(b.getKey())):(b.getValue()-a.getValue());//(freq.get(b) == freq.get(a)) ? (indexMap.get(a) - indexMap.get(b)) : (freq.get(b) - freq.get(a));
        });

        String[][] result = new String[freq.size()][2];
        int i = 0;

        for (Map.Entry<String, Integer> s : list) {
            result[i][0] = s.getKey();
            result[i][1] = String.valueOf(s.getValue());
            i++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[][] res = wordCountEngine("Practice makes perfect. you'll only get Perfect by practice. just practice!");
        for(String[] r: res)
            System.out.println(r[0]+" "+r[1]);
    }


}