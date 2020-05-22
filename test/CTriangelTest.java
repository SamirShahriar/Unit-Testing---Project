import static org.junit.Assert.*;

import org.junit.Test;

public class CTriangelTest {

	@Test
	public void test() {
		
		double side1 = 5.0;  
		double side2 = 5.0;
		double side3 = 5.0;
		
		CTriangel ctriangel = new CTriangel(side1, side2, side3);
		double expected = 7.483314773547883;
		double actual = ctriangel.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
	
	@Test
	public void test1() {
		double side1 = -5.0;
		double side2 = 5.0;
		double side3 = 5.0;
		
		CTriangel c = new CTriangel(side1, side2, side3);
		double expected = 7.483314773547883;
		double actual = c.CalculateArea();
		assertEquals(expected, actual, 0.0);
		
	}
	
	
}
	
	
