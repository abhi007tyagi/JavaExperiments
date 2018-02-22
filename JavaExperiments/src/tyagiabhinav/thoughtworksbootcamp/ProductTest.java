package tyagiabhinav.thoughtworksbootcamp;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {
	
	Object p;

	@Before
	public void setUp() throws Exception {
		p = new Product("P1");
	}

	@Test
	public void testMethods() {
		assertTrue(p instanceof Product);
	}

}
