 /*Peter Song 
 * S3C7
 * This programs is the class of circle.
 * Mr.Daniel
 * 12/13/2017
 */
package Shape;

public class Circle {

	private double radius;
	private static final double PI=3.14;
	
	public Circle(int r) {
		this.radius=r;
	}
	public Circle() {
		this.radius=1;
	}
	public double getCircumference() {
		return 2*PI*radius;
	}
	
	public double getradius() {
		return radius;
	}
	public double getArea() {
		return PI * this.radius * this.radius;
	}
}
