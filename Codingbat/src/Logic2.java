/**
 * 
 * @author PeterSong This file represents the solutions to Codingbat logic2
 *         problem set.
 */
public class Logic2 {

	public static boolean makeBricks(int small, int big, int goal) {
		int a = goal / 5;
		if (a <= big && (goal - 5 * a) <= small) {
			return true;
		} else if (a > big && (goal - 5 * big) <= small) {
			return true;
		} else
			return false;
	}
	public int luckySum(int a, int b, int c) {
		  if(a==13){
		    return 0;
		  }
		  else if(b==13){
		    return a;
		  }
		  else if(c==13){
		    return a+b;
		  }
		  else return a+b+c;
		}

	public int loneSum(int a, int b, int c) {	  
		  if(a==b){
		    if(b==c){
		      return 0;
		    }
		    else return c;
		  }
		  else if(a==c){
		    return b;
		  }
		  else if(b==c){
		    return a;
		  }
		  else return a+b+c;
		}

	public static void main(String[] args) {
		
		System.out.println(Logic2.makeBricks(3, 1, 28));
		
	}

}
