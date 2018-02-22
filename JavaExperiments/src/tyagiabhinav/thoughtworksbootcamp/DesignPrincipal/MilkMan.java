/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp.DesignPrincipal;

import java.util.List;

/**
 * @author abhinavtyagi
 *
 */
public class MilkMan {

	List<Customer> customerList;
	String name;
	double amountDue;
	
	public void getPayment(){
		customerList.forEach(customer->customer.makePayment(500));
	}
}
