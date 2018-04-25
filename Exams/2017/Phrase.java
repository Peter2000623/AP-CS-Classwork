
public class Phrase { 
	
	private String currentPhrase; 

	public Phrase(String p) {
		currentPhrase = p; 
	} 

	
	public int findNthOccurrence(String str, int n) {
		String a=currentPhrase;
		int m=0;
		for(int i=1;i<n;i++) {
			m+=a.indexOf(str)+str.length();
		 a=a.substring(a.indexOf(str)+str.length());
		 System.out.println(m);
		}
		return a.indexOf(str)+m;
	
	} 
	
	public void replaceNthOccurrence(String str, int n, String repl) {
		currentPhrase=currentPhrase.substring(0, this.findNthOccurrence(str, n))+repl+currentPhrase.substring(this.findNthOccurrence(str, n)+str.length());
	} 
	
	public int findLastOccurrence(String str) {
		boolean find=false;
		int index=0;
		for(int i=currentPhrase.length()-str.length();i>=0;i--) {
			if(currentPhrase.substring(i, i+3).equals(str)) {
				find=true;
				index=i;
				break;
			}
		}
		if(find) {
			return index;
		}
		else {
			return -1;
		}
	} 
	
	public String toString() {
		return currentPhrase; 
	} 
	public static void main(String[] args) {
		Phrase a=new Phrase("A cat ate lar");
//		System.out.println(a.findNthOccurrence("ate", 2));
//		a.replaceNthOccurrence("ate", 1, "l");
//		System.out.println(a.currentPhrase);
		System.out.println(a.findLastOccurrence("ate"));
		
	}
} 
