import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Peter Song
 * Mr. Daniel
 * APCS
 * 3/13/2018
 * This program creates a circle class. 
 */
public class Circle extends Shape implements Comparable<Circle>{

	private double r;
	private double pi=Math.PI;
	private String a;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List ab=new ArrayList();
		Circle a = new Circle("a",4.5);
		Circle b = new Circle("b",58);
		Circle c = new Circle("c",23);
		ab.add(a);
		ab.add(b);
		ab.add(c);
		Collections.sort(ab);
		System.out.println(ab);
//		
//		System.out.println(((Circle) a).getArea());
//		System.out.println(((Circle) a).getPerimeter());
//		System.out.println(a.equals(b));
//		System.out.println(a.toString());
//		System.out.println(a.compareTo(b));
	}
	public boolean equals(Circle b) {
		return this.r==b.r;		
	}
	
	public String toString() {
		return a;
	}
	
	public Circle(String a, double r) {
		this.a=a;
		this.r=r;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return pi*r*r;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 2*pi*r;
	}
	@Override
	public int compareTo(Circle o) {
		// TODO Auto-generated method stub
		
		return (int) (this.r-o.r);
	}

}
