/*
 * @author Peter Song
 * @section S3C7 APCS
 * @instructor Mr.Daniel
 * @date 3/6/2018
 * @description This programs have a superclass Item and two subclasses Book and CD.
 */
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Library {

    public static void main(String[] args) {
    		ArrayList BookList=new ArrayList();
        Item b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );    
        BookList.add(b);
        Item c = new Book("haha", "Peter", 321, false, new Date(), false );
        BookList.add(c);
        Item cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        Borrower a = new Borrower("Peter","songyong",1);
        
        System.out.println("1. See the book list."+"\n"+"2. Check the borrower information.");
        Scanner input = new Scanner(System.in);
        int selection = input.nextInt();
        while(selection!=3) {
        		if(selection==1) {
        
        		for(int i=0;i<BookList.size();i++) {
        			System.out.println(i+1+". ");
        			((Item) BookList.get(i)).printDetails();
        		}
        		System.out.println("1. Borrowing 2. Returning" +"\n"+"3. Exit.");
        		selection = input.nextInt();
        		if(selection==1) {
        			System.out.println("Which book do you want to borrow?");
        			int choice3 = input.nextInt();
        			if(((Item) BookList.get(choice3-1)).loan==false) {
        				((Item) BookList.get(choice3-1)).borrowing(a);
        				System.out.println("You've successfully borrowed that book.");
        				System.out.println("Due Date: "+((Item) BookList.get(choice3-1)).dueDate.toString());
        				System.out.println();
        			}
        			
        			else {
        				System.out.println("The book has been loaned and the due day is "+((Item) BookList.get(choice3-1)).dueDate.toString());
        				System.out.println();
        			}
        		}
        		else if(selection==2) {
    				System.out.println("Which book on your list do you want to return?");
    				int choice4 = input.nextInt();
    				((Item) BookList.get(choice4-1)).returning(a);
    				System.out.println("You've successfully returned that book.");
    				System.out.println();
    			}
        		System.out.println("1. See the book list."+"\n"+"2. Check the borrower information." +"\n"+"3. Exit.");
        		selection = input.nextInt();
        }
        else if(selection==2){
        		a.getBorrowerName();
        		a.getBorrowerID();
        		a.getEmailAddress();
        		a.printDetails();
        		System.out.println();
        		System.out.println("1. See the book list."+"\n"+"2. Check the borrower information." +"\n"+"3. Exit.");
        		selection = input.nextInt();
        }
        }
    
    }    
}