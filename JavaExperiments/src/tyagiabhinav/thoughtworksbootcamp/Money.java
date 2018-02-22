/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

/**
 * @author abhinavtyagi
 *
 */
public class Money {
	
	private Currency currency;
	private float amount;

	
	Money() {
		// TODO Auto-generated constructor stub
	}
	
	public Money(Currency c, float a) {
		this.currency = c;
		this.amount = a;
	}
	
	public Currency getCurrency() {
		return currency;
	}


	public void setCurrency(Currency currency) {
		this.currency = currency;
	}



	public float getAmount() {
		return amount;
	}



	public void setAmount(float amount) {
		this.amount = amount;
	}

	public float getTotalMoney() {
//		return 0f;
		return this.amount;
	}
	
	public float getConversionAmount(Money m2){
		 
		if(!(m2.getCurrency() instanceof Dollar)){
			return this.getCurrency().getValue();
		}
		float m1Value = this.getCurrency().getValue(); // gets in dollar
		float m2Value = m2.getCurrency().getValue(); // gets in dollar
		float finalValue = 0f;
		return finalValue;
	}
}
