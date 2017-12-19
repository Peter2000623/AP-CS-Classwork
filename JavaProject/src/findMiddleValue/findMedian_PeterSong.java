package findMiddleValue;

public class findMedian_PeterSong {
	public static int findMedian(int a, int b, int c, int d, int e){
		int[] number= {a,b,c,d,e};
		for(int j=1;j<5;j++)
        {
			for(int i=0;i<5-j;i++)
			{
				if(number[i]>number[i+1])
				{
					int temp=number[i];
					number[i]=number[i+1];
					number[i+1]=number[i];
				}
			}
        }
		return number[3];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(findMedian_PeterSong.findMedian(3, 1, 78, 35, 7));
	}
//	public static int findMedian2(int a, int b, int c, int d, int e){
//		int max1=Math.max(a, b);
//		int max2=Math.max(c, d);
//		int max3=Math.max(max2, max1);
//		int max=Math.max(max3, e);
//		
//	}
}
