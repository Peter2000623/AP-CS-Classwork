/*Peter Song
 * APCS
 * This program contains three sorting functions.
 * Mr.Daniel
 * 11/15/2017
 */
public class sort_PeterSong {
	public static void insertionSort(int[] array) {
		for(int i=0;i<array.length-1;i++) {
			int j=i;
			while((j>=0)&&(array[j+1]<array[j])) {
				int temp=array[j];
				array[j]=array[j+1];
				array[j+1]=temp;
				j--;
			}
		}
	}
	
		public static int binarySearch(int[] array, int target) {
			
			int lowerBound=0;
			int upperBound=array.length-1;
			int mid=(lowerBound+upperBound)/2;
			while(true) {
			if(array[lowerBound]>target||array[upperBound]<target) {
				return -1;
			}
			if(target>array[mid]) {
				lowerBound=mid+1;	
				mid=(lowerBound+upperBound)/2;
			}
			else if(target<array[mid]) {
				upperBound=mid;
				mid=(lowerBound+upperBound)/2;
			}
			else {
				return mid;
			}
			}
		}
	public static void selectionSort(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			int index=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int search[][] = {{1,8},{2,3,4,8}};
//int result[]=linear_search(search,8);
//System.out.println(result[0]);
//System.out.println(result[1]);
		int[] array={6,5,3,78,92,35};
//		System.out.println(binarySearch(array,89));
		insertionSort(array);
		for(int i=0;i<array.length;i++) {
		System.out.println(array[i]);
		}
	}

	
}
