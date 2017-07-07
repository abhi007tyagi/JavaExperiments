/**
 * 
 */
package tyagiabhinav.random;

import java.text.DecimalFormat;

/**
 * @author abhinavtyagi
 *
 */
public class CurrencyFormattor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DecimalFormat decimalFormat = new DecimalFormat("###,###,###.##");
		String formatted = decimalFormat.format(1234.678);
		System.out.println(formatted);
	}

}
