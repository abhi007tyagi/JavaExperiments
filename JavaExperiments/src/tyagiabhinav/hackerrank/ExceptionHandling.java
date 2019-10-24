package tyagiabhinav.hackerrank;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x, y;
		try {
			x = in.nextInt();
			y = in.nextInt();
			int z = x / y;
			System.out.println(z);
		} catch (InputMismatchException ie) {
			System.out.println("java.util.InputMismatchException");
		} catch (ArithmeticException ae) {
			System.out.println(ae.toString());
		} catch (Exception e) {
			System.out.println(e.toString());
		}

	}

}
