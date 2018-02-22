/**
 * 
 */
package tyagiabhinav.thoughtworksbootcamp;

/**
 * @author abhinavtyagi
 *
 */
public class Story extends BaseClass{
	
	@Override
	public boolean isClosed() {
		return (this.getDescription().equalsIgnoreCase("small") && this.getIteration().equals("start == end"));
	}
}
