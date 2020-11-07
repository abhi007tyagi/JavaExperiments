package tyagiabhinav.leetcode;

public class SmallestDivisorGretestThreshold {

    public static int smallestDivisor(int[] nums, int threshold) {
        int i=1, j=getMax(nums);
        int max = 1, res = 1;

        while(i<j){
            int mid = i+(j-i)/2;
            int sum = getSum(nums, mid);
            if(sum>threshold){
                i = mid+1;
            } else {
                if(sum>=max){
                    max = sum;
                    res = mid;
                }
                j = mid;
            }
        }
        return res;
    }

    private static int getMax(int[] nums){
        int max = Integer.MIN_VALUE;
        for(int n: nums)
            max = Math.max(max, n);
        return max+1;
    }

    private static int getSum(int[] nums, int m){
        int sum=0;
        for(int n: nums){
            sum += getDiv(n,m);
        }
        return sum;
    }

    private static int getDiv(int a, int b){
        if(a%b == 0)
            return (int) a/b;
        else
            return ((int) a/b) + 1;
    }

    public static void main(String[] args) {
        int[] arr = {962551,933661,905225,923035,990560};
        System.out.println(smallestDivisor(arr, 10));
    }
}
