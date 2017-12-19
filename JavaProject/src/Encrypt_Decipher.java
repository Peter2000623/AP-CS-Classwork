import java.util.Scanner;
public class Encrypt_Decipher {

	 public static void main(String arqs[])
	    {System.out.println("Please type in the key: ");
	     Scanner sc4=new Scanner(System.in);
	     int c=sc4.nextInt();
	     if(c>0)
	     {
	     System.out.println("If you want to encrypt, please type 1. If you want to decipher, please type 2. If you want to quit, please type 3.");
	     Scanner sc=new Scanner(System.in);
	     int input=sc.nextInt();
	     String Alphabet="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
	     String 数字="12345678901234567890123456789012345678901234567890";
	     String encry="";
	     int key=c%26;
	     while(input!=3) {
	     if (input==1)
	     {
	     System.out.println("Please type in the meassage you want to encrypt: ");
	     Scanner sc2=new Scanner(System.in);
	     String message=sc2.nextLine(); 
	     for(int a=0;a<message.length();a++)
	     {  char sign=message.charAt(a);
	         int b=Alphabet.indexOf(sign);
	         if(b==-1)
	         {
	             int d=数字.indexOf(sign);
	             if (d==-1)
	             {
	             encry+=sign;
	          }
	          else 
	          {
	              char sign3=数字.charAt(d+key);
	              encry+=sign3;
	            }
	        }
	         else
	         {
	         char sign2=Alphabet.charAt(b+key);
	         encry+=sign2;
	        }
	   }
	     System.out.println("Here is the meassage after the encryption: ");
	     
	  }
	 else if(input==2)
	  {System.out.println("Please type in the meassage you want to decipher: ");
	     Scanner sc3=new Scanner(System.in);
	     String message=sc3.nextLine(); 
	     for(int a=0;a<message.length();a++)
	     {  char sign=message.charAt(a);
	         int b=Alphabet.indexOf(sign);
	         if(b==-1)
	         {
	             int d=数字.indexOf(sign);
	             if (d==-1)
	             {
	             encry+=sign;
	          }
	          else 
	          {
	              char sign3=数字.charAt(d+10-key);
	              encry+=sign3;
	            }
	        }
	         else
	         {
	         char sign2=Alphabet.charAt(b+26-key);
	         encry+=sign2;
	        }
	   }
	     System.out.println("Here is the meassage after the deciphering: ");
	   }
	 else {
		 System.out.println("Error, If you want to encrypt, please type 1. If you want to decipher, please type 2.");
		 input = sc.nextInt();
	 }
	   System.out.println(encry);
	   System.out.println("If you want to encrypt, please type 1. If you want to decipher, please type 2. If you want to quit, please type 3.");
	   input = sc.nextInt();
	   encry = "";
	 }
	     System.out.println("Bye!");
	     }
	 
	}

}
