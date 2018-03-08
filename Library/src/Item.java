/*
 * @author Peter Song
 * @section S3C7 APCS
 * @instructor Mr.Daniel
 * @date 3/6/2018
 * @description This programs establishes the superclass Item.
 */
import java.util.Date;

public class Item {
	private String title;
	private String author;
	private int num;
	private boolean loan;
	private Date date;
	
	public Item(String title,String author,int num,boolean loan,Date date ) {
		this.title=title;
		this.author=author;
		this.num=num;
		this.loan=loan;
		this.date=date;
	}
	
	public void printDetails() {
		System.out.println("Title: "+"\""+title+"\""+"\n"+"Author: "+author+"\n"+"Reference Number: "+num);
		if(loan) {
			System.out.println(title+" is on loan.");
			System.out.println("The due date: "+date);
		}
		else {
			System.out.println("\""+title+"\""+" is not on loan.");
		}
		
	}
}
