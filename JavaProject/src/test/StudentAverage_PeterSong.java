/*
 * Peter Song
 * APCS S3C7
 * Instructor: Mr.Daniel
 * This program(Version2) allows teacher to enter score of assignments for each student and give the average back.
 * 28/09/2017
 */
package test;
import java.util.Scanner;
public class StudentAverage_PeterSong {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Input the number of students: ");
	int students = input.nextInt();
	int i = students;
	double sum=0;
	while(i>0) {
		System.out.println("Student"+(students-i+1)+":");
		for(int k=1;;k++) {
		System.out.print("input assignment"+k+" score: ");
		double score=input.nextDouble();
		if(score>=0 && score<=100) {
		sum+=score;
		}
		else if(score==-1) {
			k=k-1;
			System.out.println("Average is "+(sum/k));
			sum=0;
			break;
		}
		else {
			System.out.println("Invalid Input");
			k=k-1;
		}
		}
		i--;
	}
	}
}
