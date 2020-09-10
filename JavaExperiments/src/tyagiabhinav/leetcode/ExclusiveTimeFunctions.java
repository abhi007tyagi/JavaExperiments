package tyagiabhinav.leetcode;

import java.util.*;

public class ExclusiveTimeFunctions {

    public static int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int i = 1;
        int size = logs.size();
        String[] s = logs.get(0).split(":");
        stack.push(Integer.parseInt(s[0]));
        int prev = Integer.parseInt(s[2]);
        while (i < size) {
            s = logs.get(i++).split(":");
            int num = Integer.parseInt(s[2]);
            if (s[1].equals("start")) {
                if (!stack.isEmpty())
                   res[stack.peek()] += (num - prev);
                stack.push(Integer.parseInt(s[0]));
                prev = num;
            } else {
                res[stack.pop()] += (num - prev + 1);
                prev = num + 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        List<String> srr = Arrays.asList("0:start:0","0:start:2","0:end:5","0:start:6","0:end:6","0:end:7");
        int[] arr = exclusiveTime(1, srr);
        for (int nu : arr) {
            System.out.print(nu + ", ");
        }
    }
}
