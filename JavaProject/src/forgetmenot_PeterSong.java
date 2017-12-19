/*
 * Peter Song
 * S3C7
 * Mr. Daniel
 * This programs say miss you for several times and love you once at the end.
 * 10/24/2017
 */
import java.util.Scanner;
public class forgetmenot_PeterSong {

	public static void miss(int n) {
		if(n>=1) {
			System.out.println("I miss you!");
			n--;
			miss(n);
		}
		else {
			System.out.println("I love you!");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("How many times do you want?");
		int a=input.nextInt();
		miss(a);
	}

}
