/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

/**
 * @author abhinavtyagi
 *
 */
public class Product {
	
	private String name;
	private String description;
	private int measure;
	private float price;
	private String unit;
	
	Product(String name){
		this.name = name;
	}
	
	Product(String name, float price){
		this.name = name;
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMeasure() {
		return measure;
	}

	public void setMeasure(int measure) {
		this.measure = measure;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
