/*
 * Peter Song
 * APCS S3C7
 * Instructor: Mr.Daniel
 * This program allows users to choose their own adventure.
 * 10/10/2017
 */

import java.util.Scanner;
public class MyOwnAdventure_PeterSong {
	public static void myadventure() {
		Scanner input=new Scanner(System.in);
		System.out.println("Welcome, now you are a woodcutter. After a whole day hardworking, you are going back to home.");
		System.out.println("Now you want to: ");
		System.out.println("1. Go to the long but safe way.");
		System.out.println("2. Go to the short but unsafe way with a river.");
		int choice=input.nextInt();
		if (choice==1) {
			MyOwnAdventure_PeterSong.choice1();			
		}
		else if (choice==2){
			MyOwnAdventure_PeterSong.choice2();
		}
		else 
		{
			MyOwnAdventure_PeterSong.punish();
		}
	}
	public static void punish() {
		System.out.println("Your life crashes since you dare to challenge the creator.");
		System.out.println("End of the story.");
	}
	public static void choice1() {
		System.out.println("Your life crashes because of depression since you lose half of your woods because of your carelessness.");
	}
	public static void choice21() {
		System.out.println("You become rich and leave a great life because you make a lot money by selling that gold axe.");
	}
	public static void choice22() {
		Scanner input=new Scanner(System.in);
		System.out.println("She secondly finds out the silver axe.");
		System.out.println("You want to: ");
		System.out.println("1. Accept that");
		System.out.println("2. Refuse that");
		int choice=input.nextInt();
		if(choice==1) {
			MyOwnAdventure_PeterSong.choice221();
		}
		else if(choice==2) {
			MyOwnAdventure_PeterSong.choice222();
		}
		else {
			MyOwnAdventure_PeterSong.punish();
		}
	}
	public static void choice221() {
		System.out.println("You become rich and leave a ok life because you make a lot money by selling that silver axe.");
	}
	public static void choice222() {
		Scanner input = new Scanner(System.in);
		System.out.println("She thirdly finds out the wood axe.");
		System.out.println("You want to: ");
		System.out.println("1. Accept that");
		System.out.println("2. Refuse that");
		int choice=input.nextInt();
		if(choice==1) {
			MyOwnAdventure_PeterSong.choice2221();
			System.out.println("End of the story.");
		}
		else if (choice==2) {
			MyOwnAdventure_PeterSong.choice2222();
			System.out.println("End of the story.");
		}
		else {
			MyOwnAdventure_PeterSong.punish();
		}
		
	}
	public static void choice2221() {
		System.out.println("You are so honest and the godness gives both gold one and silver one to praise for your honesty.");
		System.out.println("You become wealthiest man in your country and live the best life.");
	}
	public static void choice2222() {
		System.out.println("You are out of elbows because you lose your only axe.");
	}
	public static void choice2() {
		Scanner input=new Scanner(System.in);
		System.out.println("You drop your axe(made of wood) into the river accidentally but you meet a godness who is willing to help.");
		System.out.println("She firstly finds out a gold axe.");
		System.out.println("You want to: ");
		System.out.println("1. Accept that");
		System.out.println("2. Refuse that");
		int choice=input.nextInt();
		if(choice==1) {
			MyOwnAdventure_PeterSong.choice21();
		}
		else if(choice==2) {
			MyOwnAdventure_PeterSong.choice22();
		}
		else {
			MyOwnAdventure_PeterSong.punish();
		}
	}
	public static void main(String[] args) {
//		Scanner input=new Scanner(System.in);
//		System.out.println("Welcome, now you are a woodcutter. After a whole day hardworking, you are going back to home.");
//		System.out.println("Now you want to: ");
//		System.out.println("1. Go to the long but safe way.");
//		System.out.println("2. Go to the short but unsafe way with a river.");
//		int choice=input.nextInt();
//		if (choice==1) {
//			MyOwnAdventure_PeterSong.choice1();			
//		}
//		else if (choice==2){
//			MyOwnAdventure_PeterSong.choice2();
//			if(choice==1) {
//				System.out.println("You become rich and leave a great life because you make a lot money by selling that gold axe.");
//			}
//			else if(choice==2) {
//				System.out.println("She second finds out a silver axe.");
//				System.out.println("You want to: ");
//				System.out.println("1. Accept that");
//				System.out.println("2. Refuse that");
//				choice=input.nextInt();
//				if(choice==1) {
//					System.out.println("You become rich and leave a ok life because you make a lot money by selling that silver axe.");
//				}
//				else if(choice==2) {
//					System.out.println("She second finds out the wood axe.");
//					System.out.println("You want to: ");
//					System.out.println("1. Accept that");
//					System.out.println("2. Refuse that");
//					choice=input.nextInt();
//					if(choice==1) {
//						System.out.println("You are so honest and the godness gives both gold one and silver one to praise for your honesty.");
//						System.out.println("You become wealthiest man in your country and live the best life.");
//					}
//					else if(choice==2){
//						System.out.println("You are out of elbows because of you lose your only axe.");
//					}
//					else {
//						System.out.println("Your life crashes since you dare to challenge the creator.");
//					}
//				}
//				else {
//					System.out.println("Your life crashes since you dare to challenge the creator.");
//				}
//			}
//			else {
//				System.out.println("Your life crashes since you dare to challenge the creator.");
//			}
//		}
//		else {
//			System.out.println("Your life crashes since you dare to challenge the creator.");
//		}
//		System.out.println("End of the story.");
		MyOwnAdventure_PeterSong.myadventure();
	}

}
