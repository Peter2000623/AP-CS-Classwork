
public class Decipher {
	private String Alphabet="abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String 数字="12345678901234567890123456789012345678901234567890";
    private String encry="";
    private int key;
    private String message;
    
    public Decipher(String message,int key) {
		this.message = message;
		this.key = key;
	}
    
    public String Deciphering(){
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
    	  return encry;
    }
}


