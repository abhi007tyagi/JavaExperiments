/**
 * 
 */
package tyagiabhinav.topcoder;

/**
 * @author abhinavtyagi
 *
 */
public class BettingMoney {
	
	
	public int moneyMade(int[] amounts, int[] centsPerDollar, int finalResult){
		int moneyMade = 0;
		int profit = 0;
		int loss = 0;
		
		loss = centsPerDollar[finalResult]*amounts[finalResult];
		for(int i=0;i<amounts.length; i++){
			if(i!=finalResult){
				profit+=amounts[i];
			}
		}
		moneyMade = (profit*100)-loss;
		
		return moneyMade;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] amount = {100};
		int[] cents = {10};
//		System.out.println(moneyMade(amount, cents, 0));
	}

}
