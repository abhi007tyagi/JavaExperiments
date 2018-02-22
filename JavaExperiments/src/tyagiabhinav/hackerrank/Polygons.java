package tyagiabhinav.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class Polygons {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sqCount = 0;
		int rectCount = 0;
		int otherCount = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while(true){
			int q = in.nextInt();
			System.out.println(q);
			list.add(q);
			if(!in.hasNextInt()){
				in.close();
				break;
			}
			System.out.println(in.hasNextInt());
		}
		System.out.println("OUT>>>>>>>");
		int index = 0;
		int rIndex = 0;
		while(!list.isEmpty()){
			int a = list.get(index++);
			int b = list.get(index++);
			int c = list.get(index++);
			int d = list.get(index++);
			index = 0;
			
			list.remove(rIndex++);
			list.remove(rIndex++);
			list.remove(rIndex++);
			list.remove(rIndex++);
			rIndex = 0;
	
			if(a>0 && b>0 && c>0 && d>0){
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
			}else{
				otherCount++;
			}
			if(!in.hasNextInt()){
				break;
			}
		}

		System.out.println(sqCount + " " + rectCount + " " + otherCount);
	}
}
