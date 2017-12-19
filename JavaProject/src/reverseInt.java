
public class reverseInt {
	public static int reverseInt(int input,int length) {
		if(length!=1) {
			return (int)((input%10)*Math.pow(10, (double)length-1))+reverseInt(input/10,length-1);
		}
		else return input;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseInt(98707,5));
	}

}
