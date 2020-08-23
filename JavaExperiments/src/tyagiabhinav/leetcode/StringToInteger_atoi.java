package tyagiabhinav.leetcode;

public class StringToInteger_atoi {
    public static int myAtoi(String str) {
        int size = str.length();
        char sign = '|';
        int i = 0, num = 0;
        boolean isStarted = false;
        while(i<size){
            char ch = str.charAt(i++);
            if(ch == ' '){
                if(isStarted){
                    break;
                }
            } else if(ch == '-' || ch == '+'){
                if(sign != '|' || isStarted){
                    break;
                }
                sign = ch;
                isStarted = true;
            } else if(ch >= '0' && ch <='9'){
                int chInt = ch-48;
                if(num > Integer.MAX_VALUE/10 || (num == Integer.MAX_VALUE/10 && chInt > 7)){
                    if(sign == '-'){
                        return Integer.MIN_VALUE;
                    } else {
                        return Integer.MAX_VALUE;
                    }
                }
                num = num*10 + chInt;
                isStarted = true;
            } else {
                break;
            }
        }
        return (sign == '-')? (-1*num):num;
    }

    public static void main(String[] args) {
        System.out.println(myAtoi("0-1"));
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
    }

}
