
/*
 * Peter Song
 * APCS
 * This program allows users to insert a integer into a integer array.
 * Mr.Daniel
 * 11/13/2017
 */
public class Insert {
	public static int[] insert(int[] a,int n) {
		int[] test=new int[a.length+1];
		boolean insert1=false;
		int index=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]==0&&(!insert1)) {
				test[index]=n;
				index++;
			}
			
			else if(a[i]<=n&&a[i+1]>n) {
				test[index]=a[i];
				index++;
				test[index]=n;
				index++;
				insert1=true;
			}
			
			else {
				test[index]=a[i];
				index++;
			}
		}
		return test;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,5,6,7,0,0};
		int[] b=insert(a,8);
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}
	}

}
