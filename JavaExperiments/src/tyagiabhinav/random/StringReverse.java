/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class StringReverse {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("abcdefghijklmnopqrstuvwxyz"));
	}
	
	public static String solution(String S) {
        // write your code in Java SE 8
		int length = S.length();
		StringBuilder sb = new StringBuilder(length);
		for(int i=length-1; i>0; i--){
//			System.out.print(S.charAt(i));
			sb.append(S.charAt(i));
		}
		return sb.toString();
    }

}
