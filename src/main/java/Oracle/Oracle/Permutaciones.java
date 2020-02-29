package Oracle.Oracle;

import java.util.ArrayList;
import java.util.List;

public class Permutaciones {

	public static void main(String[] args) {
		List<String> theWords = new ArrayList<String>();
		
		theWords.add("arbol");
		theWords.add("arbolito");
		theWords.add("osot");
		theWords.add("mixtoso");
		theWords.add("amix");
		theWords.add("apozolemix");

		comparing(theWords);
	}
	
	public static void comparing(List<String> words) {
		//StringBuilder palabra1 = new StringBuilder(); 
		StringBuilder palabra2 = new StringBuilder(); 
		for(int i=0; i<words.size(); i+=2) {
			palabra2 = new StringBuilder();  //words.get(i);
			palabra2.append(words.get(i));
			if(words.get(i+1).contains(words.get(i)) || words.get(i+1).contains(palabra2.reverse())) {
				System.out.println("true");
			}
			else {
				System.out.println("false");
			}
		}
	}

}
