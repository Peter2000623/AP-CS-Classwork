/*
 * Peter Song
 * Instructor: Mr.Daniel
 * 4/25/2018
 * Description: Q4 for 2017 FRQ.
 */
public class Position {
	
	int r,c;
	
	public Position(int r, int c) {
		this.r=r;
		this.c=c;
		System.out.println("("+r+", "+c+")");
	}
	
	public static Position findPosition(int a, int[][] arr) {
		Position result = null;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				if(arr[i][j]==a) {
					result=new Position(i,j);
					break;
				}
			}
		}
		return result;
	}
	
	public static Position[][] getSuccessorArray(int[][] arr){
		Position[][] result=new Position[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				result[i][j]=findPosition(arr[i][j]+1,arr);
			}
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{15,5,9,10},{12,16,11,6},{14,8,13,7}};
		findPosition(14, arr);
		getSuccessorArray(arr);
	}

}



	