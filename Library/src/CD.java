import java.util.Date;

public class CD extends Item{
	private String type;
	
	public CD(String title, String author, int num, boolean loan, Date date,String type) {
		super(title, author, num, loan, date);
		this.type=type;
		// TODO Auto-generated constructor stub
	}
	
	public void printDetails() {
		super.printDetails();
		System.out.println("Music Type: "+type);
		System.out.println();
	}

}
