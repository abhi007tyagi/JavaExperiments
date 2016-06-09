/**
 * 
 */
package tyagiabhinav.corsera.algo1.interview;

import java.util.Arrays;

/**
 * @author abhinavtyagi
 *
 */
public class ThreeSumImproved {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a= {-2,-1,4,0,-3,-5,1,2,3,5,8,-4,4,21,23,43,65,7,99,87,690,9,33,11,78,44,-8,32,-11,-23,32};
		long start = System.currentTimeMillis();
		threeSumNaive(a, 0);
		long end = System.currentTimeMillis();
		System.out.println("Total Time: "+(end-start));
		start = System.currentTimeMillis();
		threeSumImp(a, 0);
		end = System.currentTimeMillis();
		System.out.println("Total Time: "+(end-start));
	}
	
	private static void threeSumImp(int[] arr, int val){
		Arrays.sort(arr);
		int size = arr.length;
		int count = 0, j,k;
		for(int i=0; i<size-2; i++){
			j=i+1;
			k=size-1;
			while(j<k){
				if(arr[i]+arr[j]+arr[k] == val){
					System.out.print("{"+arr[i]+","+arr[j]+","+arr[k]+"}\n");
					count++;
					k--; // we miss j++ cases, so there should be no duplicate entry
				} else if(arr[i]+arr[j]+arr[k] > val){
					k--;
				} else {
					j++;
				}
			}
		}
		System.out.println("Count: "+count);
	}
	
	private static void threeSumNaive(int[] arr, int val){
		int size = arr.length;
		int count = 0;
		for(int i=0; i<size-2; i++){
			for(int j=i+1; j<size-1; j++){
				for(int k=j+1; k<size; k++){
					if(arr[i]+arr[j]+arr[k] == val){
						System.out.print("{"+arr[i]+","+arr[j]+","+arr[k]+"}\n");
						count++;
					}
				}
			}
		}
		System.out.println("Count: "+count);
	}

}
