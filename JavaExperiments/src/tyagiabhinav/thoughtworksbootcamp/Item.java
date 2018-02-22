/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

/**
 * @author abhinavtyagi
 *
 */
public class Item {
	private Product product;
	private int quantity;
	
	Item(Product p, int q){
		this.product= p;
		this.quantity = q;
	}
	
	public float total(){
		return this.product.getPrice() * this.quantity; 
	}
}
