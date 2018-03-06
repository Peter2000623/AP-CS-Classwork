/*
 * @author Peter Song
 * @section S3C7 APCS
 * @instructor Mr.Daniel
 * @date 3/6/2018
 * @description This programs have a superclass Item and two subclasses Book and CD.
 */
import java.util.Date;

public class Library {

    public static void main(String[] args) {
    	
        Book b = new Book("12 Rules for Life", "Jordan Peterson", 123, false, new Date(), false );
        b.printDetails();
        
        CD cd = new CD("And Justice for all", "Metallica", 567, false, new Date(), "Metal");
        cd.printDetails();
    }    
}