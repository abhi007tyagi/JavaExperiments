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
        
        String FORMAT = "###,###.##";
        
        DecimalFormat us = new DecimalFormat(FORMAT);
        us.setPositivePrefix("$");
        System.out.println("US: " + us.format(payment));
        
        DecimalFormat in = new DecimalFormat(FORMAT);
        in.setPositivePrefix("Rs.");
        System.out.println("India: " + in.format(payment));
        
        DecimalFormat cn = new DecimalFormat(FORMAT);
        cn.setPositivePrefix("￥");
        System.out.println("China: " + cn.format(payment));
        
        DecimalFormatSymbols unusualSymbols = new DecimalFormatSymbols();
        unusualSymbols.setDecimalSeparator(',');
        unusualSymbols.setGroupingSeparator(' ');
        DecimalFormat fr = new DecimalFormat(FORMAT, unusualSymbols);
        fr.setPositiveSuffix(" €");
        System.out.println("France: " + fr.format(payment));
        

        /* Create custom Locale for India. 
          I used the "IANA Language Subtag Registry" to find India's country code */
        Locale indiaLocale = new Locale("en", "IN");

        /* Create NumberFormats using Locales */
        NumberFormat usa     = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        /* Print output */        
        System.out.println("US: "     + usa.format(payment));
        System.out.println("India: "  + india.format(payment));
        System.out.println("China: "  + china.format(payment));
        System.out.println("France: " + france.format(payment));
		
	}

}
