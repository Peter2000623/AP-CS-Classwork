/*
 * Peter Song
 * APCS
 * Instructor: Mr.Daniel
 * This program allows users to encript or decipher message. 
 * 12/27/2017
 */
import java.util.Scanner;
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please type in the key: ");
		Scanner sc4 = new Scanner(System.in);
		int c = sc4.nextInt();
		
		if (c > 0) {
			System.out.println(
					"If you want to encrypt, please type 1. If you want to decipher, please type 2. If you want to quit, please type 3.");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			while(input!=3) {
			if (input == 1) {
				System.out.println("Please type in the meassage you want to encrypt: ");
				Scanner sc2 = new Scanner(System.in);
				String message = sc2.nextLine();
				Encript user = new Encript(message, c);
				System.out.println("Here is the meassage after the encryption: ");
				System.out.println(user.Encryption());
				System.out.println("If you want to encrypt, please type 1. If you want to decipher, please type 2. If you want to quit, please type 3.");
				   input = sc.nextInt();		  
			} else if (input == 2) {
				System.out.println("Please type in the meassage you want to encrypt: ");
				Scanner sc2 = new Scanner(System.in);
				String message = sc2.nextLine();
				Decipher user = new Decipher(message, c);
				System.out.println("Here is the meassage after the encryption: ");
				System.out.println(user.Deciphering());
				System.out.println("If you want to encrypt, please type 1. If you want to decipher, please type 2. If you want to quit, please type 3.");
				   input = sc.nextInt();
			}
			else {
				 System.out.println("Error, If you want to encrypt, please type 1. If you want to decipher, please type 2.");
				 input = sc.nextInt();
			 }
			
			}
			System.out.println("Bye!");

		}
		
	}
}
