//package tyagiabhinav.corsera.algo1.assignment2;
//
///**
// *
// */
//import edu.princeton.cs.algs4.StdIn;
//
///**
// * @author abhinavtyagi
// *
// */
//public class Subset {
//
//	/**
//	 * @param args
//	 */
//	public static void main(String[] args) {
//		int k = Integer.parseInt(args[0]);
////		Scanner sc = new Scanner(System.in);
//		String input = StdIn.readString();//sc.nextLine();//
//		input = input.replaceAll("\\s+","");
//		if(k <= input.length() && k >= 0){
//			RandomizedQueue<Character> rq = new RandomizedQueue<Character>();
//			char[] arr = input.toCharArray();
//			for(int i=0; i<input.length(); i++){
//				if(' ' != arr[i])
//					rq.enqueue(arr[i]);
//			}
//			for(int i=0; i<k; i++){
//				System.out.println(rq.dequeue());
//			}
//		}else{
//			throw new IndexOutOfBoundsException("Subset length should be less than or equal to number of characters and more than -1!");
//		}
//	}
//
//}
