import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Item {
	public String title;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


	private String author;
	private int num;
	public boolean loan;
	private Date date;
	private int borrowerID;
	public Date dueDate;
	
	public Item(String title,String author,int num,boolean loan,Date date ) {
		this.title=title;
		this.author=author;
		this.num=num;
		this.loan=loan;
		this.date=date;
	}
	
	private static Date addDays(Date date, int days) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		cal.add(Calendar.DATE,days);
		return cal.getTime();
	}
	
	public void borrowing(Borrower a) {
		this.loan = true;
		Date today = new Date();
		dueDate = addDays(today, 14);
		a.list.add(title);
		borrowerID=a.borrowerID;
		a.updateItemsOnLoan();
	}
	
	public void returning(Borrower a) {
		this.loan=false;
		for(int i=0;i<a.list.size();i++) {
			if(a.list.get(i).equals(title)) {
				a.list.remove(i);
			}
		}
		borrowerID=a.borrowerID;
		a.updateItemsOnLoan2();
	}
	
	
	public void printDetails() {
		System.out.println("Title: "+"\""+title+"\""+"\n"+"Author: "+author+"\n"+"Reference Number: "+num);
		if(loan) {
			System.out.println("\""+title+"\""+" is on loan.");
			System.out.println("The due date: "+dueDate);
			System.out.println("BorrowerID: "+borrowerID);
		}
		else {
			System.out.println("\""+title+"\""+" is not on loan.");
		}
		
		
	}
}
