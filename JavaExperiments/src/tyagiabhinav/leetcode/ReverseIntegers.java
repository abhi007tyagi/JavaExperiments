package tyagiabhinav.leetcode;

public class ReverseIntegers {
    public static int reverse(int x) {
        int res = 0;
        while ((x/10!=0 || x%10!=0)){
            res = res*10 + x%10;
            x=x/10;
            if(res<(Integer.MIN_VALUE/10) || res>Integer.MAX_VALUE/10){
                return 0;
            }
            System.out.println("res-"+res);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(reverse(-1534236469));
    }
}
