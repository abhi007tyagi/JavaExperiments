/**
 * 
 */
package tyagiabhinav.codility;

/**
 * @author abhinavtyagi
 *
 */
public class RightRotate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateRight rotateRight = new RotateRight();
		int[] a = {1,2,3,4,5};
		a = rotateRight.rotateRight(a, 15);
		
		for(int t: a){
			System.out.print(t+",");
		}
	}
}

class RotateRight{
	
	public int[] rotateRight(int[] arr, int k){
		int arrSize = arr.length;
		int temp[] = new int[arrSize];
		int i=0;
		
		if(arrSize>0)
			k%=arrSize;
		else
			return arr;
		
		while(i<arrSize){
			if(k>arrSize-1){
				k=0;
			}
			temp[k++]=arr[i++];
		}
		
		return temp;
	}
}
