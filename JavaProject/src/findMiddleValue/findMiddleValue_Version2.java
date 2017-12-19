package findMiddleValue;

public class findMiddleValue_Version2 {
	public static int findMedian(int a,int b,int c) {
		if(a>c) {
			if(b>a) {
				return a;
			}
			else if(c>b){
				return c;
			}
			else {
				return b;
			}
		}
		else if(b>c){
			return c;			
		}
		else {
			if(b>a){
				return b;
			}
			else {
				return a;
			}
		}
	}
	public static int findMedian(int a,int b,int c,int d, int e){
		int max1 = Math.max(a, b);
		int max2 = Math.max(c, d);
		int max3 = Math.max(max1, max2);
		int max4= Math.max(max3, e);
		int min1 = Math.min(a, b);
		int min2 = Math.min(c, d);
		int min3 = Math.min(min1, min2);
		int min4= Math.min(min3, e);
		StringBuffer index = new StringBuffer("");
		if(a!=max4&&a!=min4) {
			index.append("1");
		}
		if(b!=max4&&b!=min4) {
			index.append("2");
		}
		if(c!=max4&&c!=min4) {
			index.append("3");
		}
		if(d!=max4&&d!=min4) {
			index.append("4");
		}
		if(e!=max4&&e!=min4) {
			index.append("5");
		}
		int f=0;
		int g=0;
		int h=0;
		if(index.substring(2).equals("1")) {
			f=a;
			index.deleteCharAt(2);
		}
		if(index.substring(2).equals("2")) {
			f=b;
			index.deleteCharAt(2);
		}
		if(index.substring(2).equals("3")) {
			f=c;
			index.deleteCharAt(2);
		}
		if(index.substring(2).equals("4")) {
			f=d;
			index.deleteCharAt(2);
		}
		if(index.substring(2).equals("5")) {
			f=e;
			index.deleteCharAt(2);
		}
		if(index.substring(1).equals("1")) {
			g=a;
			index.deleteCharAt(1);
		}
		if(index.substring(1).equals("2")) {
			g=b;
			index.deleteCharAt(1);
		}
		if(index.substring(1).equals("3")) {
			g=c;
			index.deleteCharAt(1);
		}
		if(index.substring(1).equals("4")) {
			g=d;
			index.deleteCharAt(1);
		}
		if(index.substring(1).equals("5")) {
			g=e;
			index.deleteCharAt(1);
		}
		if(index.substring(0).equals("1")) {
			h=a;
			index.deleteCharAt(0);
		}
		if(index.substring(0).equals("2")) {
			h=b;
			index.deleteCharAt(0);
		}
		if(index.substring(0).equals("3")) {
			h=c;
			index.deleteCharAt(0);
		}
		if(index.substring(0).equals("4")) {
			h=d;
			index.deleteCharAt(0);
		}
		if(index.substring(0).equals("5")) {
			h=e;
			index.deleteCharAt(0);
		}
		return findMiddleValue_Version2.findMedian(f, g, h);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		StringBuffer a = new StringBuffer("");
//		a.append("1");
//		System.out.println(a);
		System.out.println(findMiddleValue_Version2.findMedian(3, 2, 9, 9, 10));
	}
}
