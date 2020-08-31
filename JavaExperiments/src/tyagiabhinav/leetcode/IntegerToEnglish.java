package tyagiabhinav.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class IntegerToEnglish {

    private static Map<Integer, String> engMap;

    static {
        engMap = new HashMap<>();
        engMap.put(1000000000, "Billion");
        engMap.put(1000000, "Million");
        engMap.put(1000, "Thousand");
        engMap.put(100, "Hundred");
        engMap.put(90, "Ninety");
        engMap.put(80, "Eighty");
        engMap.put(70, "Seventy");
        engMap.put(60, "Sixty");
        engMap.put(50, "Fifty");
        engMap.put(40, "Forty");
        engMap.put(30, "Thirty");
        engMap.put(20, "Twenty");
        engMap.put(19, "Nineteen");
        engMap.put(18, "Eighteen");
        engMap.put(17, "Seventeen");
        engMap.put(16, "Sixteen");
        engMap.put(15, "Fifteen");
        engMap.put(14, "Fourteen");
        engMap.put(13, "Thirteen");
        engMap.put(12, "Twelve");
        engMap.put(11, "Eleven");
        engMap.put(10, "Ten");
        engMap.put(9, "Nine");
        engMap.put(8, "Eight");
        engMap.put(7, "Seven");
        engMap.put(6, "Six");
        engMap.put(5, "Five");
        engMap.put(4, "Four");
        engMap.put(3, "Three");
        engMap.put(2, "Two");
        engMap.put(1, "One");
        engMap.put(0, "Zero");
    }

    public static String numberToWords(int num) {
        Stack<Integer> stack = new Stack<>();
//        int counter = 0;
        StringBuilder strB = new StringBuilder();
        int decChk = 1000000000;
        int tempChk = 1000000;
        while(num !=0) {
            if(num>decChk) {
                int n = num/decChk;
                strB.append(engMap.get(n)).append(" ");
                if(decChk == 1000*tempChk) strB.append(decChk);
                else if(decChk == 100*tempChk)
                decChk/=10;
            }
        }




//        while(num !=0){
//            stack.push(num%10);
//            num/=10;
//            counter++;
//        }

//        while(!stack.isEmpty()){
//            int n = stack.pop();
//            if(count)
//
//        }
        return "";
    }

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
    }

}
