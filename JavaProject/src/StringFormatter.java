import java.util.ArrayList;
import java.util.List;

public class StringFormatter {
	public static int totalLetters(List<String> wordList){
	String test="";
	for(int i=0;i<wordList.size();i++) {
		test+=wordList.get(i);
	}
	return test.length();
}
	
	public static int basicGapWidth(List<String> wordList, int formattedlen) {
		int wordlen=totalLetters(wordList);
		return (formattedlen-wordlen)/(wordList.size()-1);
	}
	public static int leftoverSpaces(List<String> wordList, int formattedlen) {
		int wordlen=totalLetters(wordList);
		return (formattedlen-wordlen)%(wordList.size()-1);
	}
	public static String format(List<String> wordList,int formattedlen) {
		String test="";
		int index=0;
		for(int i=0;i<wordList.size();i++) {
			test+=wordList.get(i);
			if(index!=leftoverSpaces(wordList,formattedlen)) {
				test+=" ";
				index++;
			}
			for(int j=0;j<basicGapWidth(wordList,formattedlen);j++) {
				test+=" ";
			}
		}
		return test;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> test=new ArrayList();
		test.add("A");
		test.add("fro");
		test.add("is");
		System.out.println(format(test,20));
	}

}
