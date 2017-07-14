/**
 * 
 */
package tyagiabhinav.random;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author abhinavtyagi
 *
 */
public class CurrencyFormatter {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        
        String FORMAT = "##,###.##";
        
        DecimalFormat us = new DecimalFormat(FORMAT);
        us.setPositivePrefix(NumberFormat.getCurrencyInstance(Locale.US).getCurrency().getSymbol());
        System.out.println("US: " + us.format(payment));
        
        DecimalFormat in = new DecimalFormat(FORMAT);
        in.setPositivePrefix("Rs.");
        System.out.println("India: " + in.format(payment));
        
        DecimalFormat cn = new DecimalFormat(FORMAT);
        cn.setPositivePrefix(NumberFormat.getCurrencyInstance(Locale.CHINESE).getCurrency().getSymbol());
        System.out.println("China: " + cn.format(payment));
        
        DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols();
        unusualSymbols.setDecimalSeparator(',');
        unusualSymbols.setGroupingSeparator(' ');
        DecimalFormat fr = new DecimalFormat(FORMAT, unusualSymbols);
        fr.setPositiveSuffix(NumberFormat.getCurrencyInstance(Locale.FRENCH).getCurrency().getSymbol());
        System.out.println("France: " + fr.format(payment));
		
	}

}
