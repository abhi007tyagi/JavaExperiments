package tyagiabhinav.leetcode;

import java.util.Arrays;

public class NextPermutation {

    public static void nextPermutation(int[] nums) {
        int size = nums.length;
        int i = size-2;
        while(i>=0 && nums[i+1] <= nums[i] ){
            i--;
        }
        if(i>=0){
            int j = size-1;
            while(j>=0 && nums[j]<nums[i]){
                j--;
            }
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        i++;
        int j = size-1;
        while(i<j){
            int temp = nums[i];
            nums[i++] = nums[j];
            nums[j--] = temp;
        }
        printNums(nums);
    }

    private static void forString(String str){
        int size = str.length();
        char[] chars = str.toCharArray();
        int i = size-2;
        while(i>=0 && chars[i+1] <= chars[i] ){
            i--;
        }
        if(i>=0){
            int j = size-1;
            while(j>=0 && chars[j] < chars[i]){
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        i++;
        int j = size-1;
        while(i<j){
            char temp = chars[i];
            chars[i++] = chars[j];
            chars[j--] = temp;
        }
        System.out.println(new String(chars));
    }

    private static void printNums(int[] nums) {
        for (int i : nums) {
            System.out.print(i);
        }
    }

    public static void main(String[] args) {
//        int[] nums = {1,2,3};
//        nextPermutation(nums);
//        System.out.println();
//        nums = new int[]{3,2,1};
//        nextPermutation(nums);
//        System.out.println();
//        nums = new int[]{3,2,1,2};
//        nextPermutation(nums);
//        System.out.println();
//        nums = new int[]{1,2};
//        nextPermutation(nums);
//        System.out.println();
//        nums = new int[]{1,2,3,5,4,6,7,5,4,3,2,1};
//        nextPermutation(nums);
        forString("adgjmsrqpo");
    }

}
