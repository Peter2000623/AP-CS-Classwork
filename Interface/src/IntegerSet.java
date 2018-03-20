/*
 * Peter Song
 * APCS S3C7
 * Mr. Daniel
 * 3/20/2018
 * This program uses an interface to write merge function.
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class IntegerSet implements Mergeable{
	public ArrayList<Integer> b;
	
	
	
	public IntegerSet(List<Integer> a) {
		
		this.b=new ArrayList<Integer>(a);
	}
	
	public void printElement() {
		for(int i=0;i<b.size();i++) {
			 System.out.println(b.get(i));
			 }
	}
	@Override
	public Object merge(Object c) {
		// TODO Auto-generated method stub
//		for(int i=0;i<((ArrayList<Integer>)(c)).size();i++) {
//			b.add(((ArrayList<Integer>)(c)).get(i));
//		}
		ArrayList<Integer> d=new ArrayList<Integer>();
		d.addAll(b);
		d.addAll((Collection<? extends Integer>) c);
		return d;
	}
	
	public int size() {
		return b.size();
	}
	public boolean elementOf(int i) {
		boolean find=false;
		for(int j=0;j<b.size();j++) {
			if(((int)b.get(j))==i) {
				find=true;
			}
		}
		return find;
	}
	
	 public static void main(String[] args) {
		 List<Integer> c=Arrays.asList(3,4,5);
//		 ArrayList<Integer> a=new ArrayList<Integer>();
//		 a.add(3);
//		 a.add(4);
//		 a.add(7);
		 IntegerSet b=new IntegerSet(c);
//		 ArrayList<Integer> e=(ArrayList<Integer>)(Arrays.asList(3,4,5));
		 
//		 c.add(5);
//		 c.add(6);
		 ArrayList<Integer> d=(ArrayList<Integer>) b.merge(c);
		 b.printElement();
		 System.out.println();
		 for(int i=0;i<d.size();i++) {
			 System.out.println(d.get(i));
		 }
		 System.out.println("Size: "+b.size());
		 System.out.println(b.elementOf(3));
	 }

}
