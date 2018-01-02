
public class Encript {
	private String Alphabet="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String 数字="12345678901234567890123456789012345678901234567890";
    private String encry="";
    private int key;
    private String message;
    public Encript(String message,int key) {
		this.message = message;
		this.key = key;
	}
    public String Encryption(){
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
    	  return encry;
    }
}
