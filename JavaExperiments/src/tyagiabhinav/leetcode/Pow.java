package tyagiabhinav.leetcode;

public class Pow {

    public static double myPow(double x, int n) {
        if (x == 1 || n == 0) return 1;
        if (x == 0) return 0;
        if (n == 1) return x;

        double res = 1;
        boolean isNeg = (n < 0);
        if (isNeg) {
            if (n == Integer.MIN_VALUE) {
                n = Integer.MAX_VALUE;
            } else {
                n = Math.abs(n);
            }
        }
        res = x;
        boolean isOdd = false;
        if (n % 2 != 0) {
            isOdd = true;
            n--;
        }

        int i = 2;
        while (i <= n) {
            res *= res;
            i += 2;
        }

        if (isOdd) {
            res *= x;
        }

        return res;
    }


    public static double bruteMyPow(double x, int n) {
        // return Math.pow(x,n);
        if (x == 1 || n == 0) return 1;
        if (x == 0) return 0;
        if (n == 1) return x;

        double res = 1;
        boolean isNeg = (n < 0);
        if (isNeg) {
            if (n == Integer.MIN_VALUE) {
                res = x;
                n = Integer.MAX_VALUE;
            } else {
                n = Math.abs(n);
            }
        }

        for (int i = 0; i < n; i++) {
            res *= x;
        }
        if (isNeg) {
            res = 1 / res;
        }

        return res;
    }

    public static void main(String[] args) {
//        System.out.println(myPow(2.00, -2147483648));
        System.out.println(myPow(2.00, 10));
    }
}
