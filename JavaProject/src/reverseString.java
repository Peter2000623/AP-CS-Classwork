
public class reverseString {
	public static String reverseString(String input) {
		if(input.length()!=0) {
			return input.substring(input.length()-1,input.length())+reverseString(input.substring(0,input.length()-1));
		}
		else {
			return "";
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseString("adsga"));
	}

}
