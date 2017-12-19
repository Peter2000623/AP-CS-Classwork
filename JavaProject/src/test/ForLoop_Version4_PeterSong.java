/*
 * Peter Song
 * APCS S3C7
 * Instructor: Mr.Daniel
 * This program can print out "*" for several lines.
 * 27/09/2017
 */
package test;
import java.util.Scanner;

public class ForLoop_Version4_PeterSong {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Number of the last line: ");
		int length = input.nextInt();
//		if (length%2!=0) {
//		for(int j=0;j<length;j++) {			
//			for(int i=length/2-j;i>=0;i--) {
//			if(i!=0){
//				System.out.print(" ");
//				}
//				if(i==0) {
//					for (int a=2*(j+1)-1;a>0;a--) {
//				System.out.print("*");					
//				if (a==1) {
//					System.out.println("");
//				}
//				}
//				}			
//		}
//	}
//}
//		else {
//			System.out.println("Invalid Input");
//		}
		for(int i=length/2+1;i>0;i--) {
			for(int k=0;k<i-1;k++) {
				System.out.print(" ");
			}
			for(int x=0;x<length+2-2*i;x++) {
				System.out.print("*");
			}
			System.out.println("");
		}
}
}

