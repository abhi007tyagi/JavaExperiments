package tyagiabhinav.leetcode;

public class HouseRobber {

    public static int rob(int[] nums) {
        //return rob(nums, nums.length - 1);
        if (nums.length == 0) return 0;
        int[] memo = new int[nums.length + 1];
        memo[0] = 0;
        memo[1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];
            memo[i+1] = Math.max(memo[i], memo[i-1] + val);
        }
        return memo[nums.length];
    }

    private static int rob(int[] nums, int i){
        if(i<0) return 0;
        return Math.max(rob(nums, i-2) + nums[i], rob(nums,i-1));
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[]{2,7,9,3,1,9,0,2,1,3}));
    }
}
