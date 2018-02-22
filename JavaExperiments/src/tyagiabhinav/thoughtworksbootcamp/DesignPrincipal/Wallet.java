/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.DesignPrincipal;

/**
 * @author abhinavtyagi
 *
 */
public class Wallet {
	
	double money;
	
	public double getMoney(double amount){
		return 0d;
		}
	
	private void deduct(double amount){
		if(this.money < amount){
			System.out.println("Less Money");
			return;
		}
		this.money -= amount;
	}
}
