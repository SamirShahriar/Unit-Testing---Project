import static org.junit.Assert.*;

import org.junit.Test;

public class CCircleTest {

	@Test
	public void test() {
		
		int radius = 1;
		CCircle ccircle = new CCircle(radius);
		double expected = 3;
		double actual = ccircle.CalculateArea();
		assertEquals(expected, actual, 0.0);
	}
	
	@Test
	public void test1() 
	
	{
		int radius = 1;
		CCircle a = new CCircle(radius);
		double expected = 3.141592653589793;
		double actual = a.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
		
	}
	
	

}




