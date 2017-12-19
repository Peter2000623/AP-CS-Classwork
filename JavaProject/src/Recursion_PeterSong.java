/*
 * Peter Song
 * APCS
 * Instructor: Mr.Daniel
 * This program contains bunch of functions using recursion.
 * 10/25/2017
 */
import java.util.Scanner;
public class Recursion_PeterSong {
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}
	public static int getPost() {
		Scanner input=new Scanner(System.in);
		System.out.println("Please type in a number: ");
		int num=input.nextInt();
		if(num<0) {
			System.out.println("Error.");
			return getPost();
		}
		else {
			return num;
		}		
	}
	public static int addUp(int n) {
		if(n>0) {
			int sum=n;
			n--;
			return sum+addUp(n);		
		}
		else {
			return n;
		}
	}
	public static int addUp2(int n) {
		if(n>0) {
			return n+addUp(n-1);			
		}
		else {
			return n;
		}		
	}
	public static int fibonacci(int n) {
		if(n==1) {
			return 0;
		}
		else if(n==2) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}		
	}
	public static int numberOfZeros(int n) {
		if(n==0) {
			return 1;
		}
		else if (n<10) {
			return 0;
		}	
		else if(n%10==0) {
				return 1+numberOfZeros(n/10);
			}
			else {
				return numberOfZeros(n/10);
			}
		}
	public static String numberToEnglish(int n) {
		if(n==0) {
			return "zero ";
		}
		else if(n<10) {
			if(n==0) {
				return "zero ";
			}
			else if(n==1) {
				return "one ";
			}
			else if(n==2) {
				return "two ";
			}
			else if(n==3) {
				return "three ";
			}
			else if(n==4) {
				return "four ";
			}
			else if(n==5) {
				return "five ";
			}
			else if(n==6) {
				return "six ";
			}
			else if(n==7) {
				return "seven ";
			}
			else if(n==8) {
				return "eight ";
			}
			else {
				return "nine ";
			}
		}
		else if(n%10==0) {		
			return numberToEnglish(n/10)+"zero ";
		}
		else if(n%10==1) {
			return numberToEnglish(n/10)+"one ";
		}
		else if(n%10==2) {
			return numberToEnglish(n/10)+"two ";
		}
		else if(n%10==3) {
			return numberToEnglish(n/10)+"three ";
		}	
		else if(n%10==4) {
			return numberToEnglish(n/10)+"four ";
		}
		else if(n%10==5) {
			return numberToEnglish(n/10)+"five ";
		}
		else if(n%10==6) {
			return numberToEnglish(n/10)+"six ";
		}
		else if(n%10==7) {
			return numberToEnglish(n/10)+"seven";
		}
		else if(n%10==8) {
			return numberToEnglish(n/10)+"eight";
		}
		else  {
			return numberToEnglish(n/10)+"nine";
		}
	}
	public static int binarySearch(int lowerBound, int upperBound, int target) {
		int[] array={1,3,4};
		int mid=(lowerBound+upperBound)/2;
		if(upperBound-lowerBound==0&&target!=array[mid]) {
			return -1;
		}
		if(target>array[mid]) {
			return binarySearch(mid+1,upperBound,target);
		}
		if(target<array[mid]) {
			return binarySearch(lowerBound,mid-1,target);
		}		
			return mid;
		
	}
	public static void merge(int[] a) {
		if(a.length<2) {
			return;
		}
		int[] b=new int[a.length/2];
		int[] c=new int[(a.length+1)/2];
		for(int i=0;i<b.length;i++) {
			b[i]=a[i];
		}
		for(int j=0;j<c.length;j++) {
			c[j]=a[j+a.length/2];
		}
		merge(b);
		merge(c);
//		for(int i=0;i<b.length;i++) {
//		System.out.println(b[i]);
//		}
//		for(int i=0;i<c.length;i++) {
//			System.out.println(c[i]);
//			}
		int indexb=0;
		int indexc=0;
		for(int i=0;i<a.length;i++) {
			if(indexb==b.length) {
				a[i]=c[indexc];
				indexc++;
			}
			else if(indexc==c.length) {
				a[i]=b[indexb];
				indexb++;
			}
			else if(b[indexb]>c[indexc]) {
				a[i]=c[indexc];				
				indexc++;				
			}
			else {
				a[i]=b[indexb];				
					indexb++;		
			}
			
		}
	}
	public static int reverseInt(int input,int length) {
		if(length!=1) {
			return (int)((input%10)*Math.pow(10, (double)length-1))+reverseInt(input/10,length-1);
		}
		else return input;
	}
	public static String reverseString(String input) {

		if(input.length()!=0) {
			return input.substring(input.length()-1,input.length())+reverseString(input.substring(0,input.length()-1));
		}
		else {
			return "";
		}
		
	}
	

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
//		Scanner input = new Scanner(System.in);
//		System.out.print("Number: ");
//		int a=input.nextInt();
//		System.out.println(numberOfZeros(a));
//		System.out.println(numberToEnglish(a));
//		System.out.println(binarySearch(0,2,4));
//		int[] test= {7,8,5,4,3,98,78};
//		merge(test);
//		for(int i=0;i<test.length;i++) {
//		System.out.println(test[i]);
//		}
		System.out.print(fibonacci(-1));
	}
	
}
