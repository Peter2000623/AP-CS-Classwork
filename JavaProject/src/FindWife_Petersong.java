/*
 * Peter Song
 * APCS S3C7
 * Instructor: Mr. Daniel
 * This program allows user to find a wife through some questions.
 * 09/22/2017
 */
import java.util.Scanner;
public class FindWife_Petersong {
	public static void main(String[] arqs){
		Scanner input = new Scanner(System.in);
		System.out.println("What's your sex?(Male,Female)");
		String sex = input.nextLine();
		if (sex.equals("Female")) {
			System.out.println("How old are you?");
			int age = input.nextInt();
			if (age>=16&&age<=18) {
				System.out.println("Do you like playing sports?(true,false)");
				Scanner input2 = new Scanner(System.in);
				String likeSports = input2.nextLine();
				if (likeSports.equals("false")) {
					System.out.println("Do you like eating?(true,false)");
					Scanner input3 = new Scanner(System.in);
					String likeEating = input3.nextLine();
					if (likeEating.equals("true")) {
						System.out.println("Do you like reading?(true,false)");
						Scanner input4 = new Scanner(System.in);
						String likeReading = input4.nextLine();
						if (likeReading.equals("false")) {
							System.out.println("You can be my wife");
						}
						else {
							System.out.println("I'm sorry but you don't fit me");
						}
					}
					else {
						System.out.println("I'm sorry but you don't fit me");
					}
				}
				else {
					System.out.println("I'm sorry but you don't fit me");
				}
			}
			else {
				System.out.println("I'm sorry but you don't fit me");
			}
		}
		else {
			System.out.println("I'm sorry but you don't fit me");
		}
		
		
	}
}
