package tyagiabhinav.fb;

import java.io.*;
import java.util.*;
// Add any extra import statements you may need here


class QueueRemoval {

    // Add any helper functions you may need here


    int[] findPositions(int[] arr, int x) {
        Queue<int[]> q1 = new LinkedList<>();
        Queue<int[]> q2 = new LinkedList<>();
        for (int i = 0; i < arr.length; i++) {
            q1.add(new int[]{arr[i], i + 1});
        }
        int[] res = new int[x];
        int loop = x, poploop = x, i = 0;
        while (loop-- > 0) {
            int[] max = {0, Integer.MAX_VALUE};
            while (poploop-- > 0 && !q1.isEmpty()) {
                int[] t = q1.poll();
                if ((t[0] > max[0]) || (t[0] == max[0] && t[1] < max[1])) {
                    max = t;
                }
                q2.add(t);
            }
            res[i++] = max[1];
            q2.remove(max);
            while (!q2.isEmpty()) {
                int[] t = q2.poll();
                if (t[0] > 0)
                    t[0]--;
                q1.add(t);
            }
            poploop = x;
        }
        return res;
    }


    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom, but they are otherwise not editable!
    int test_case_number = 1;

    void check(int[] expected, int[] output) {
        int expected_size = expected.length;
        int output_size = output.length;
        boolean result = true;
        if (expected_size != output_size) {
            result = false;
        }
        for (int i = 0; i < Math.min(expected_size, output_size); i++) {
            result &= (output[i] == expected[i]);
        }
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printIntegerArray(expected);
            System.out.print(" Your output: ");
            printIntegerArray(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printIntegerArray(int[] arr) {
        int len = arr.length;
        System.out.print("[");
        for (int i = 0; i < len; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.print("]");
    }

    public void run() {
        int n_1 = 6;
        int x_1 = 5;
        int[] arr_1 = {1, 2, 2, 3, 4, 5};
        int[] expected_1 = {5, 6, 4, 1, 2};
        int[] output_1 = findPositions(arr_1, x_1);
        check(expected_1, output_1);

//        int n_2 = 13;
//        int x_2 = 4;
//        int[] arr_2 = {2, 4, 2, 4, 3, 1, 2, 2, 3, 4, 3, 4, 4};
//        int[] expected_2 = {2, 5, 10, 13};
//        int[] output_2 = findPositions(arr_2, x_2);
//        check(expected_2, output_2);

        // Add your own test cases here

    }

    public static void main(String[] args) {
        new QueueRemoval().run();
    }
}