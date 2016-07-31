/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class AirplaneSeatAllocation {
	
	private static int allotSeat(int N, String S){
		int allottedSeats = 0;
		for(int i=1; i<=N; i++){
			//for A,B,C
			if(!S.contains(String.valueOf(i)+'A') && !S.contains(String.valueOf(i)+'B') && !S.contains(String.valueOf(i)+'C')){
				allottedSeats++;
				System.out.println(i+"in ABC");
			}
			//for D,E,F
			if(!S.contains(String.valueOf(i)+'D') && !S.contains(String.valueOf(i)+'E') && !S.contains(String.valueOf(i)+'F')){
				allottedSeats++;
				System.out.println(i+"in DEF");
			}else //for E,F,G
			if(!S.contains(String.valueOf(i)+'E') && !S.contains(String.valueOf(i)+'F') && !S.contains(String.valueOf(i)+'G')){
				allottedSeats++;
				System.out.println(i+"in EFG");
			}
			
			//for H,J,K
			if(!S.contains(String.valueOf(i)+'H') && !S.contains(String.valueOf(i)+'J') && !S.contains(String.valueOf(i)+'K')){
				allottedSeats++;
				System.out.println(i+"in HJK");
			}
			
		}
		return allottedSeats;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String S = "1A 2B 3C 4A 5B 6C 7A 8B 9C 10A 1E 2F 3G 4D 5E 6F 7G 8D 9E 10F 1H 2J 3K 4H 5J 6K 7H 8J 9K 10H";
		System.out.println(allotSeat(10, S));
	}

}
