 /*Peter Song 
 * S3C7
 * This programs is the class of rectangle.
 * Mr.Daniel
 * 12/13/2017
 */
package Shape;

public class Rectangle {

	private double l;
	private double w;
	
	public Rectangle() {
		this.l=1;
		this.w=1;
	}
	
	public Rectangle(double le, double wi ) {
		this.l=le;
		this.w=wi;
	}
	
	public double getCircumference() {
		return 2*l*w;
	}
	
	public double getArea() {
		return l*w;
	}
}
