package tyagiabhinav.leetcode;

import java.util.Stack;

public class DailyTemperatures {

    public static int[] dailyTemperatures(int[] T) {
        Stack<Integer> stack = new Stack<>();
        int size = T.length;
        int[] res = new int[size];
        for (int i = T.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && T[i] >= T[stack.peek()]) {
                stack.pop();
            }
            if (!stack.isEmpty())
                res[i] = stack.peek() - i;
            stack.push(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
//        int[] arr = {73, 74, 75, 73, 69, 72, 76, 73, 72, 71, 70, 69, 68, 68, 72, 79, 80, 76};
        arr = dailyTemperatures(arr);
        for (int n : arr)
            System.out.print(n + " ");
    }
}
