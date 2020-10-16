package tyagiabhinav.pramp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PairsWithKdifference {

    private static int[][] findPairsWithGivenDifference(int[] arr, int k) {
        // your code goes here
        List<int[]> pairs = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int n: arr)
            set.add(n+k);

        for(int i=0; i<arr.length; i++){
            if(set.contains(arr[i]))
                pairs.add(new int[]{arr[i], arr[i]-k});
        }
        return pairs.toArray(new int[pairs.size()][]);
    }

    public static void main(String[] args) {
        int arr[] = {0, -1, -2, 2, 1};
        int[][] res = findPairsWithGivenDifference(arr, 1);
        for(int[] p: res)
            System.out.println(p[0]+", "+p[1]);
    }

}
