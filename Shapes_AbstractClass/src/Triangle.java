/*
 * Peter Song
 * Mr. Daniel
 * APCS
 * 3/13/2018
 * This program creates a triangle class. 
 */
public class Triangle extends Shape{
		private double a;
		private double b;
		private double c;
		
		public Triangle(double a,double b,double c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
		public boolean equals(Triangle a) {
			return this.a==a.a&&this.b==a.b&&this.c==a.c;
			
			
		}
		@Override
		public double getArea() {
			// TODO Auto-generated method stub
			double p = (a+b+c)/2;
			return Math.pow(p*(p-a)*(p-b)*(p-c), 0.5);
		}

		@Override
		public double getPerimeter() {
			// TODO Auto-generated method stub
			return a+b+c;
		}
		public String toString() {
			return "a: "+a+"\n"+"b: "+b+"\n"+"c: "+c;
		}
		public static void main(String[] args) {
			Triangle a = new Triangle(3,4,5);
			Triangle b = new Triangle(8,4,5);
			System.out.println(a.getArea());
			System.out.println(a.getPerimeter());
			System.out.println(a.equals(b));
			System.out.println(a.toString());
		}
		
}