/**
 * 
 */
package tyagiabhinav.hackerrank;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class JavaBitSet {
	
	static BitSet B1;
	static BitSet B2;
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		B1 = new BitSet(N);
		B2 = new BitSet(N);


		int M = in.nextInt();
		String[] inputCommand = new String[M];

		in.nextLine();
		for (int i = 0; i < M; i++) {
			inputCommand[i] = in.nextLine();
		}
		
		in.close();

		for (int i = 0; i < M; i++) {
			process(inputCommand[i]);
			System.out.println(B1.cardinality() + " " + B2.cardinality());
		}
	}

	static void process(String inputCommand) {
		String[] inputs = inputCommand.split(" ");
		int first = Integer.parseInt(inputs[1]);
		int second = Integer.parseInt(inputs[2]);
		switch (inputs[0]) {
		case "AND":
			if (first == 1) {
				B1.and(B2);
			} else if (first == 2) {
				B2.and(B1);;
			}
			break;
		case "OR":
			if (first == 1) {
				B1.or(B2);;
			} else if (first == 2) {
				B2.or(B1);
			}
			break;
		case "XOR":
			if (first == 1) {
				B1.xor(B2);
			} else if (first == 2) {
				B2.xor(B1);
			}
			break;
		case "FLIP":
			if (first == 1) {
				B1.flip(second);
			} else if (first == 2) {
				B2.flip(second);
			}
			break;
		case "SET":
			if (first == 1) {
				B1.set(second);
			} else if (first == 2) {
				B2.set(second);
			}
			break;
		}
	}
}
