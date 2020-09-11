package tyagiabhinav.leetcode;

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int size = nums.length;
        boolean[] temp = new boolean[size+1];
        for(int n: nums){
            temp[n] = true;
        }

        for(int i=0; i<=size; i++){
            if(!temp[i]) return i;
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {0,1};
        missingNumber(arr);
    }
}
