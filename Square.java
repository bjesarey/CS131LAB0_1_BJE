/**
 * Create a Square object and give it a value, along with an area method.
 */

/**
 * @author Brandon Esarey
 * @version 1.1 Square project Semester year 2023
 */
public class Square {
	private double x;// Will be used as the side of the square.

	public Square() {
		x = 1.0;
	}// End Constructor

	public Square(double side) {
		x = side;
	}// End Constructor

	public void setX(double side) {
		x = side;
	}// End SetX

	public double getX() {
		return x;
	}// End GetY

	public double area() {
		return x * 4;
	}// End area() method
}// End Square
