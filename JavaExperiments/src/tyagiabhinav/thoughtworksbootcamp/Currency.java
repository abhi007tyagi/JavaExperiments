/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

/**
 * @author abhinavtyagi
 *
 */
public class Currency {
	
	private float value;
	private char symbol;
	
	// get value against standard currency
	public float getValue() {
		return value;
	}

	// set value against standard currency
	public void setValue(float value) {
		this.value = value;
	}
	
	public char getSymbol() {
		return symbol;
	}

	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}

}
