/**
 * Demonstrate how objects can be used in different classes.
 */

/**
 * @author brandonesarey
 * @version 1.1 Application project Semester year 2023
 */
public class Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square s = new Square();
		Circle c = new Circle();
		System.out.println("Square area: " + s.area());
		System.out.println("Circle area: " + c.area());
	}// End main()

}// End Application
