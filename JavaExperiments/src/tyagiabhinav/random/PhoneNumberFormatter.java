/**
 * 
 */
package tyagiabhinav.random;

/**
 * @author abhinavtyagi
 *
 */
public class PhoneNumberFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(solution("0 - 22 1985--324"));
	}
	
	public static String solution(String S) {
        // write your code in Java SE 8
		S = S.replaceAll("[- ]+", "");
		System.out.println(S);
		
		int strLength = S.length();
		StringBuilder sb = new StringBuilder(strLength+ (strLength/3)+1);
		
		int i = 0;
	    String temp = "";
	    while (i < strLength){
	        sb.append(temp);
	        temp = "-";
	        int k = 3;
	        if(strLength-i == 4){
	        	k = 2;
	        }
        	sb.append(S.substring(i, Math.min(i + k, strLength)));
            i += k;
	    }
		System.out.println(sb.toString());
		return sb.toString();
    }
	
	public static String insertPeriodically(
		    String text, String insert, int period)
		{
		    StringBuilder builder = new StringBuilder(
		         text.length() + insert.length() * (text.length()/period)+1);

		    
		    return builder.toString();
		}

}
