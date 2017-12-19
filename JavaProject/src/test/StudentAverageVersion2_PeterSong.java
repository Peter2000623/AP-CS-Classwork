/*
 * Peter Song
 * APCS S3C7
 * Instructor: Mr.Daniel
 * This program allows teacher to enter score of assignments for each student and give the average back.
 * 28/09/2017
 */
package test;
import java.util.Scanner;
public class StudentAverageVersion2_PeterSong {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.print("Input the number of students: ");
	int students = input.nextInt();
	System.out.print("Input the number of assignments: ");
	int assignments = input.nextInt();
	int i = students;
	double sum=0;
	while(i>0) {
		System.out.println("Student"+(students-i+1)+":");
		for(int k = assignments;k>0;k--) {
		System.out.print("input assignment"+(assignments-k+1)+" score: ");
		sum+=input.nextDouble();
		}
		System.out.println("Average is "+(sum/assignments));
		sum=0;
		i--;
	}
	}
}
