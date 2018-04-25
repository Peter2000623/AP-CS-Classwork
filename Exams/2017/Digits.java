import java.util.ArrayList;

public class Digits 
{ 

	private ArrayList<Integer> digitList; 

	public Digits(int num) {
		digitList=new ArrayList<Integer>();
		int a=num;
		while(a>9) {
			digitList.add(0,a%10);
			a/=10;
			
		}
		digitList.add(0,a);
		
	}
	
	public boolean isStrictlyIncreasing() {
		boolean is=true;
		for(int i=0;i<digitList.size()-1;i++) {
			if(digitList.get(i)==digitList.get(i+1)||digitList.get(i)>digitList.get(i+1)) {
				is=false;
			}
		}
		return is;
	} 
	
	public static void main(String[] args) {
		Digits a=new Digits(244);
		for(int i=0;i<a.digitList.size();i++) {
		System.out.println(a.digitList.get(i));
		}
		System.out.println(a.isStrictlyIncreasing());
	}
} 
