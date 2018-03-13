/*
 * Peter Song
 * Mr. Daniel
 * APCS
 * 3/13/2018
 * This program creates a circle class. 
 */
public class Circle extends Shape{

	private double r;
	private double pi=Math.PI;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle a = new Circle(4.5);
		Circle b = new Circle(4.5);
		System.out.println(((Circle) a).getArea());
		System.out.println(((Circle) a).getPerimeter());
		System.out.println(a.equals(b));
		System.out.println(a.toString());
	}
	public boolean equals(Circle b) {
		return this.r==b.r;		
	}
	
	public String toString() {
		return ""+r;
	}
	
	public Circle(double r) {
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

}
