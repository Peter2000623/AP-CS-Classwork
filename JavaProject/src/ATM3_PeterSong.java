/*
 * Peter Song
 * APCS S3C7 
 * Instructor: Mr.Daniel
 * This is a program simulating a bank using switch and while sentences.
 * 26/09/2017
 */
import java.util.Scanner;
public class ATM3_PeterSong {
	public static void main(String arqs[]) {
			Scanner input = new Scanner(System.in);
			System.out.println("Welcome!\n"
					+ "Withdraw a deposit:\t1\nMake a deposit:\t2\nCheck your balance:\t3\nExit:\t4\nEnter the number for your transaction");
			int choice = input.nextInt();
			double deposit = 22500;
			while(choice!=4) {
			switch(choice) {
			case 1: System.out.println("How much do you want to withdraw?");
			double withdraw = input.nextDouble();
			if (deposit>=withdraw) {
				deposit-=withdraw;
				System.out.println("You have successfully withdraw "+withdraw+
						"$\nNow you have "+deposit+"& left");
				System.out.println("Chioce: ");
				choice = input.nextInt();
			}
			else {
				System.out.println("Error!");
				System.out.println("Chioce: ");
				choice = input.nextInt();
			}
			break;
			case 2:System.out.println("How much do you want to make a deposit?");
			double makeDeposit = input.nextDouble();
			if(makeDeposit>0) {
				deposit+=makeDeposit;
				System.out.println("Now you have "+deposit+"& in our deposit");
				System.out.println("Chioce: ");
				choice = input.nextInt();
			}
			else {
				System.out.println("Error!");
				System.out.println("Chioce: ");
				choice = input.nextInt();
			}
			break;
			case 3:
				System.out.println("Now you have "+deposit+"& in our deposit");
				System.out.println("Chioce: ");
				choice = input.nextInt();
				break;
			default:
				System.out.println("What are you doing?!\n"
						+ "Withdraw a deposit:\t1\nMake a deposit:\t2\nCheck your balance:\t3\nExit:\t4\nEnter the number for your transaction");
				choice = input.nextInt();
				
			}	
			}
			System.out.println("Bye!");
			}
		}

