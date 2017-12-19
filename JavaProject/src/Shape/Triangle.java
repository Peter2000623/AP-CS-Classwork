 /*Peter Song 
 * S3C7
 * This programs is the class of triangle.
 * Mr.Daniel
 * 12/13/2017
 */
package Shape;

public class Triangle {
	
	private double a;
	private double b;
	private double c;
	
	public Triangle() {
		this.a=1;
		this.b=1;
		this.c=1;
	}
	
	public Triangle(int a, int b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	
	public double getCircumference() {
		return a+b+c;
	}
	
	public double getArea() {
		return a*b/2;
	}
}
