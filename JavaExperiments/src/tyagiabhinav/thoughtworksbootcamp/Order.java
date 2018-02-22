/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

import java.util.List;

/**
 * @author abhinavtyagi
 *
 */
public class Order {

	private List<Item> items;
	
	public float total(){
		return (float) items.stream().mapToDouble(v -> v.total()).sum();
	}
	
	Order(List<Item> items){
		this.items = items;
	}
	
}
