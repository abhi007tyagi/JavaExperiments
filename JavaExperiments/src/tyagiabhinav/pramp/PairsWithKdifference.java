package tyagiabhinav.pramp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PairsWithKdifference {

    static int[][] findPairsWithGivenDifference(int[] arr, int k) {
        List<int[]> pairs = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: arr)
            map.put(n-k, n);

        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]))
                pairs.add(new int[]{map.get(arr[i]), arr[i]});
        }
        return pairs.toArray(new int[pairs.size()][]);
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, -2, 2, 1};
        int[][] res = findPairsWithGivenDifference(arr, 1);
        for(int[] p: res)
            System.out.println(p[0]+","+p[1]);
    }

}
