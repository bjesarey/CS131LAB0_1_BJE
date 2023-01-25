
/**
 * Create a Circle object and give it a value, along with an area method.
 */

/**
 * @author brandonesarey
 * @version 1.1 Circle project Semester year 2023
 */
public class Circle {

	private double ra;// Will be the radius of the circle.

	public Circle() {
		ra = 1.0;
	}// End Constructor

	public Circle(double radius) {
		ra = radius;
	}// End Constructor

	public void setRA(double radius) {
		ra = radius;
	}// End setRA

	public double getRA() {
		return ra;
	}// End getRA

	public double area() {
		return Math.PI * (Math.pow(ra, 2));
	}// End area() method

}// End Circle
