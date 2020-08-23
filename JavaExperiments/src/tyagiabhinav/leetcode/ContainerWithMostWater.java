package tyagiabhinav.leetcode;

public class ContainerWithMostWater {
        public int bruteForceMaxArea(int[] height) {
            int size = height.length;
            int maxArea = 0;
            for(int i=0;i<size;i++){
                for(int j=i+1; j<size; j++){
                    int area = getArea(i, height[i], j, height[j]);
                    maxArea = Math.max(area, maxArea);
                }
            }
            return maxArea;
        }

        public static int maxArea(int[] height) {
            int size = height.length;
            int i=0, j=size-1;
            int maxArea = 0;
            while(i<j){
                int area = getArea(i, height[i], j, height[j]);
                maxArea = Math.max(area, maxArea);
                if(height[i]>height[j]) j--;
                else i++;
            }
            return maxArea;
        }

        public static int getArea(int ai, int bi, int aj, int bj){
            int length = aj-ai;
            int bredth = Math.min(bi,bj);
            return length*bredth;
        }

    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
