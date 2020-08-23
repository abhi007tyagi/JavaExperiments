//package tyagiabhinav.thoughtworksbootcamp;
//
//import static org.junit.Assert.*;
//
//import org.junit.Before;
//import org.junit.Test;
//
//public class MoneyTest {
//
//	Dollar d;
//	Rupee r;
//	Euro e;
//
//	Money mDollar, mRupee, mEuro, mTotal;
//
//	@Before
//	public void setUp() throws Exception {
//		d = new Dollar();
//		d.setValue(1f);
//
//		r = new Rupee();
//		r.setValue(0.016f);
//
//		e = new Euro();
//		e.setValue(1.22f);
//
//		mDollar = new Money(d, 10);
//		mRupee = new Money(r, 10);
//		mTotal = new Money();
//	}
//
////	@Test
////	public void testDollar() {
////		assertTrue(mDollar.getTotalMoney() == 10);
////	}
//
////	@Test
////	public void testRupee() {
////		assertTrue(mRupee.getTotalMoney() == 10);
////	}
//
//	@Test
//	public void testConversion() {
//		assertTrue(mRupee.getConversionAmount(mDollar) == 0.016f);
//	}
//
//}
