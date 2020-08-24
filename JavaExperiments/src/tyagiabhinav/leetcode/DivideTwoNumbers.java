package tyagiabhinav.leetcode;

public class DivideTwoNumbers {

    public static int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) return Integer.MAX_VALUE;
            if (divisor == 1) return Integer.MIN_VALUE;
        }
        if (divisor == dividend) return 1;
        if (dividend == 0) return 0;

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        divisor = Math.abs(divisor);

        int quotient = 0;
        if (dividend < 0) {
            while (dividend <= 0) {
                dividend += divisor;
                quotient++;
            }
        } else {
            while (dividend >= 0) {
                dividend -= divisor;
                quotient++;
            }
        }

        return sign * (quotient-1);

//        int counter = 0;
//        if (dividend > 0 && divisor > 0) {
//            while (dividend >= 0) {
//                dividend -= divisor;
//                counter++;
//            }
//            return (counter - 1);
//        } else if (dividend < 0 && divisor > 0) {
//            while (dividend <= 0) {
//                dividend += divisor;
//                counter++;
//            }
//            return -1 * (counter - 1);
//        } else if (dividend < 0 && divisor < 0) {
//            divisor *= -1;
//            while (dividend <= 0) {
//                dividend += divisor;
//                counter++;
//            }
//            return (counter - 1);
//        } else {
//            while (dividend >= 0) {
//                dividend += divisor;
//                counter++;
//            }
//            return -1 * (counter - 1);
//        }
    }

    public static void main(String[] args) {
        System.out.println(divide(10, 3));
        System.out.println(divide(10, -3));
        System.out.println(divide(-10, 3));
        System.out.println(divide(-10, -3));
        System.out.println(divide(Integer.MIN_VALUE, -2));
        System.out.println(divide(Integer.MIN_VALUE, 2));
        System.out.println(divide(Integer.MIN_VALUE, 1));
        System.out.println(divide(Integer.MIN_VALUE, -1));
        System.out.println(Integer.MIN_VALUE / (-2));
    }

}
