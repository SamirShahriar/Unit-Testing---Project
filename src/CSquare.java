
public class CSquare extends CShape {

	public int side = 1;

	public CSquare() {
	}
	
	public CSquare(int side) {
		shapename = "Square";
		setSide(side);
	}

	public void setSide(int side) {
		if (isValidlength(side)) this.side= side;
	}
	
	private boolean isValidlength(int s) {
		
		return (s>0);
	}

	@Override
	protected double CalculateArea() {
		
		return side*side;
	}
	
	public String toString()
	{
		return "this is a " + shapename + " with area " + CalculateArea();
	}

}
