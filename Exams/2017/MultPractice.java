/*
 * Peter Song
 * Instructor: Mr.Daniel
 * 4/25/2018
 * Description: Q2 for 2017 FRQ.
 */
public class MultPractice implements StudyPractice{
	
	int a;
	int b;
	
	public MultPractice(int a,int b) {
		this.a=a;
		this.b=b;
	}
	public String getProblem() {
		return a+" TIMES "+b;
	}

	
	public void nextProblem() {
		b++;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultPractice c=new MultPractice(2,3);
		c.nextProblem();
		c.nextProblem();
		System.out.println(c.getProblem());
		
	}

}
