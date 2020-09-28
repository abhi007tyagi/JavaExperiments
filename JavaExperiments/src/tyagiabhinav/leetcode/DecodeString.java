package tyagiabhinav.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString {

    public static String decodeString(String s) {
        StringBuilder fStrB = new StringBuilder();
        StringBuilder strB = new StringBuilder();
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isDigit(ch)) {
                strB.append(ch);
            } else if (ch == '[') {
                stack.push(strB.toString());
                strB.setLength(0);
            } else if (ch == ']') {
                stack.push(strB.toString());
                String temp = getString(stack);
                if(stack.size()>2) stack.push(stack.pop()+temp);
                else {
                    fStrB.append(temp);
                }
                strB.setLength(0);
            } else if (Character.isLetter(ch)) strB.append(ch);
        }
        return fStrB.toString();
    }

    private static String getString(Stack<String> stack) {
        StringBuilder strB = new StringBuilder();
//        while(!stack.isEmpty()){
        String str = stack.pop() + strB.toString();
        int count = Integer.valueOf(stack.pop());
        while (count != 0) {
            strB.append(str);
            count--;
        }
//        }
        return strB.toString();
    }


    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
        System.out.println(decodeString("2[abc]3[cd]ef"));
        System.out.println(decodeString("abc3[cd]xyz"));
        System.out.println(decodeString("11[a]10[brc]6[,]"));
        System.out.println(decodeString("3[a[2c]]"));

        List<String> list = new ArrayList<>();
    }
}
