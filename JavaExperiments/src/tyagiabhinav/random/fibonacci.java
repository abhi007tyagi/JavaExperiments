package tyagiabhinav.random;

import java.util.HashMap;
import java.util.Map;

public class fibonacci {

    public static int getFibonacci(int n) {
//        return fib(n);
        int a = 0, b = 1, sum = 0;
        if (n == 0) return a;
        if (n == 1) return b;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return sum;
    }

//    private static int fib(int n){
//        if(n == 1) return 1;
//        if(n == 2) return 2;
//        return (fib(n-1) + fib(n-2));
//    }

    public static void main(String[] args) {
        System.out.println(getFibonacci(12));
    }
}
