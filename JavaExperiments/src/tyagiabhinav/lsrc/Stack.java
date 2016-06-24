/**
 * 
 */
package tyagiabhinav.lsrc;

/**
 * @author abhinavtyagi
 *
 */
public class Stack {
	
	private int top=0;
	private int[] arr;
	private int size;
	
	Stack(int s){
		this.size = s;
		arr = new int[size];
	}
	
	public boolean isEmpty(){
		return (top==0);
	}
	
	public boolean isFull(){
		return (top==size);
	}
	
	public void push(int n){
		if(top<size ){
			arr[top++]=n;
//			printArray(arr);
		}
		else{
			System.out.println("Stack Full !!");
//			printArray(arr);
		}
	}
	
	public int pop(){
		if(top>0){
			int p = arr[--top];
			arr[top] = 0;
//			System.out.println("Pop->"+p);
//			printArray(arr);
			return p;
		}
		else{
			System.out.println("Stack Empty !!");
//			printArray(arr);
		}
		return -1;
	}
	
	public void printArray(int[] arr) {
		int arrayLength = arr.length;
		for (int i = 0; i < arrayLength; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("------");
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack S = new Stack(10);
		System.out.println(S.isEmpty());
		S.push(10);
		System.out.println(S.isEmpty());
		S.push(3);
		S.push(7);
		S.push(1);
		S.push(31);
		S.push(2);
		S.push(0);
		S.push(13);
		S.push(79);
		S.pop();
		S.pop();
		S.push(4);
		S.push(6);
		S.pop();
		S.pop();
		S.pop();
	}

}
