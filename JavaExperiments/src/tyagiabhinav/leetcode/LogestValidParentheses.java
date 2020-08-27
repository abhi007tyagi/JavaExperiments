package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LogestValidParentheses {
    private static Map<Character, Character> getOpp = new HashMap<>(6);

    static {
        getOpp.put(')', '(');
        getOpp.put('}', '{');
        getOpp.put(']', '[');
    }

    public static boolean isValid(String s) {
        int size = s.length();
        if (size == 0) return true;
        if (size % 2 != 0) return false;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < size; i++) {
            char ch = s.charAt(i);
            if (stack.empty()) stack.push(ch);
            else if (stack.peek() == getOpp.get(ch)) stack.pop();
            else stack.push(ch);
        }
        return stack.isEmpty();
    }

    public static int bruteLongestValidParentheses(String s) {
        int size = s.length();
        if (size < 2) return 0;
        int max = 0;
        for (int i = 0; i < size; i++) {
            StringBuilder strB = new StringBuilder();
            strB.append(s.charAt(i));
            for (int j = i + 1; j < size; j++) {
                strB.append(s.charAt(j));
                if (isValid(strB.toString())) {
                    max = Math.max(max, strB.length());
                }
            }
        }
        return max;
    }

    public static int longestValidParentheses(String s) {
        int size = s.length();
        int l = 0, r = 0, max = 0;
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '(') l++;
            else r++;
            if (l == r) {
                max = Math.max(max, 2*r);
            } else if (r >= l) {
                l = 0;
                r = 0;
            }
        }
        l = 0; r = 0;
        for (int i = size-1; i >=0; i--) {
            if (s.charAt(i) == '(') l++;
            else r++;
            if (l == r) {
                max = Math.max(max, 2*l);
            } else if (l >= r) {
                l = 0;
                r = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        String str = "((())())(()))(()()(()(()))(()((((()))))))((()())()))()()(()(((((()()()())))()())(()()))((((((())))((()))()()))))(()))())))()))()())((()()))))(()(((((())))))()((()(()(())((((())(())((()()(()())))())(()(())()()))())(()()()))()(((()())(((()()())))(((()()()))(()()))()))()))))))())()()((()(())(()))()((()()()((())))()(((()())(()))())())))(((()))))())))()(())))()())))())()((()))((()))()))(((())((()()()(()((()((())))((()()))())(()()(()))))())((())))(()))()))))))()(()))())(()())))))(()))((())(()((())(((((()()()(()()())))(()())()((()(()()))(()(())((()((()))))))))(()(())()())()(()(()(()))()()()(()()())))(())(()((((()()))())))(())((()(())())))))())()()))(((())))())((()(()))(()()))((())(())))))(()(()((()((()()))))))(()()()(()()()(()(())()))()))(((()(())()())(()))())))(((()))())(()((()))(()((()()()(())()(()())()(())(()(()((((())()))(((()()(((()())(()()()(())()())())(()(()()((()))))()(()))))(((())))()()))(()))((()))))()()))))((((()(())()()()((()))((()))())())(()((()()())))))))()))(((()))))))(()())))(((()))((()))())))(((()(((())))())(()))))(((()(((((((((((((())(((()))((((())())()))())((((())(((())))())(((()))))()())()(())())(()))))()))()()()))(((((())()()((()))())(()))()()(()()))(())(()()))()))))(((())))))((()()(()()()()((())((((())())))))((((((()((()((())())(()((()))(()())())())(()(())(())(()((())((())))(())())))(()()())((((()))))((()(())(()(()())))))))))((()())()()))((()(((()((()))(((((()()()()()(()(()((()(()))(()(()((()()))))()(()()((((((()((()())()))((())()()(((((()(()))))()()((()())((()())()(())((()))()()(()))";
//        String str = ")()()(";
        long start = System.currentTimeMillis();
        System.out.println(bruteLongestValidParentheses(str));
        long end = System.currentTimeMillis();
        System.out.println(end-start);

        long start2 = System.currentTimeMillis();
        System.out.println(longestValidParentheses(str));
        long end2 = System.currentTimeMillis();
        System.out.println(end2-start2);
    }

}
