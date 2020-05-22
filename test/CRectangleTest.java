import static org.junit.Assert.*;

import org.junit.Test;

public class CRectangleTest {

	@Test
	public void test() {
		
		int length = -5;
		int width = 2;
		CRectangle crectangle = new CRectangle(length, width);
		double expected = -10.00; 
		double actual = crectangle.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
	
	@Test 
	public void test1() {
		CRectangle r = new CRectangle(20, 5);
		double expected = 100.00;
		double actual = r.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
	
	@Test 
	public void test2() {
		CRectangle r1 =new CRectangle(5, -2);
		double expected = -10.00;
		double actual = r1.CalculateArea();
		assertEquals(expected, actual, 0.0);
	
	}

	@Test
	public void test3() {
		CRectangle r2 = new CRectangle(3, 3);
		int expected =12;
		double actual = r2.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
}
