import java.util.Scanner;
public class MyOwnAdventure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Please type the number of lines");
		int line = input.nextInt();	
		for(int j=1;j<=line*2-1;j++) {
			for(int i=0;i<(line-Math.abs(line-j));i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
		
		}
	

//for(int j=0;j<=7;j++) {
//	if(j<=4) {
//	for(int i=0;i<j;i++) {
//	System.out.print("*");	
//}
//	}
//
//	else {
//		for(int i=0;i<8-j;i++) {
//			System.out.print("*");	
//	}
//	}
//	System.out.println();
//
//
//}

