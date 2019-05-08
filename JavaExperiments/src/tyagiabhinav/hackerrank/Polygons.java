package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Polygons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sqCount = 0;
		int rectCount = 0;
		int otherCount = 0;
		ArrayList<String> list = new ArrayList<>();
		String row = null;
		while (!(row = in.nextLine()).isEmpty()) {
//			list.add(row);
//		}
//
//		for (String line : list) {
//			System.out.println(line);
			
			

			String[] lengths = row.split(" ");
			int a = Integer.parseInt(lengths[0]);
			int b = Integer.parseInt(lengths[1]);
			int c = Integer.parseInt(lengths[2]);
			int d = Integer.parseInt(lengths[3]);

//			System.out.println(a + " " + b + " " + c + " " + d);
			if (a > 0 && b > 0 && c > 0 && d > 0) {
				if (a == b && b == c && c == d && d == a) {
					double sqAB = Math.sqrt(a * a + b * b);
					double sqCD = Math.sqrt(c * c + d * d);
					if (sqAB == sqCD) {
						sqCount++;
					} else {
						rectCount++;
					}
				} else if ((a == b && c == d) || (a == d && b == c) || (a == c && b == d)) {
					rectCount++;
				} else {
					otherCount++;
				}
			} else {
				otherCount++;
			}
		}

		System.out.println(sqCount + " " + rectCount + " " + otherCount);
	}
}
