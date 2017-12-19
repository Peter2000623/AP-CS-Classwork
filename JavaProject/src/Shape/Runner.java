/*
 * Peter Song 
 * S3C7
 * This programs allows to create different shapes.
 * Mr.Daniel
 * 12/13/2017
 */
package Shape;
import java.util.Random;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random d = new Random();
		Circle a = new Circle(d.nextInt());
		Circle b = new Circle(d.nextInt());
		System.out.println(a.getArea());
		System.out.println(a.getCircumference());
		System.out.println(b.getArea());
		System.out.println(b.getCircumference());
		Rectangle c = new Rectangle(d.nextInt(),d.nextInt());
		Rectangle e = new Rectangle(d.nextInt(),d.nextInt());
		System.out.println(c.getArea());
		System.out.println(e.getArea());
		System.out.println(e.getCircumference());
		System.out.println(c.getCircumference());
	}

}
