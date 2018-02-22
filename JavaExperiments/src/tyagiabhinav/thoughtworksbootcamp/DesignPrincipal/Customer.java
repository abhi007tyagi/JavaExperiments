/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.DesignPrincipal;

/**
 * @author abhinavtyagi
 *
 */
public class Customer {
	
	String name;
	String address;
	Wallet wallet;
	
	public String makePayment(double payment) {
		if(this.wallet != null){
			this.wallet.getMoney(500);
		}
		return "No Money";
	}

}
