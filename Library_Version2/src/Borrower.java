import java.util.ArrayList;

public class Borrower {
	
	String borrowerName;
	String emailAddress;
	int borrowerID;
	int itemsOnLoan;
	public ArrayList list = new ArrayList();
	public Borrower(String a, String b, int c) {
		borrowerName=a;
		emailAddress=b;
		borrowerID=c;
		itemsOnLoan=0;
		
	}
	
	public void getBorrowerName() {
		System.out.println("Name: "+borrowerName);
	}
	
	public void getEmailAddress() {
		System.out.println("Address: "+emailAddress);
	}
	
	public void getBorrowerID() {
		System.out.println("ID: "+borrowerID);
	}
	
	public void getItemsOnLoan() {
		System.out.println(itemsOnLoan);
	}
	
	public void updateItemsOnLoan() {
		itemsOnLoan++;
	}
	
	public void printDetails() {
		System.out.println("Book List: ");
		for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
		}
	}

	public void updateItemsOnLoan2() {
		// TODO Auto-generated method stub
		itemsOnLoan--;
	}
}
