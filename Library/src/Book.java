/*
 * @author Peter Song
 * @section S3C7 APCS
 * @instructor Mr.Daniel
 * @date 3/6/2018
 * @description This program sets up the Book class.
import java.util.Date;

public class Book extends Item{
	private boolean requested;
	
	public Book(String title, String author, int num, boolean loan, Date date,boolean requested) {
		super(title, author, num, loan, date);
		this.requested=requested;
		// TODO Auto-generated constructor stub
	}

	public void printDetails() {
		super.printDetails();
		if(requested) {
			System.out.println("The book is requested by others. You have to wait.");
		}
		else {
			System.out.println("The book is not requested by others. You are OK to go.");
		}
		System.out.println();
	}
}
