import static org.junit.Assert.*;

import org.junit.Test;

public class CSquareTest {

	@Test
	public void test() {
		CSquare csquare = new CSquare(2);
		double expected = 4.0;
		double actual = csquare.CalculateArea();
		assertEquals(expected, actual, 0.0);
				
	}
	
	@Test
	public void test1() {
		CSquare csquare1 = new CSquare(-2);
		double expected = -4.0;
		double actual = csquare1.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
	
}
