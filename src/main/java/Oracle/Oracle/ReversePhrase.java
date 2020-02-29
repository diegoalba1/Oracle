package Oracle.Oracle;

public class ReversePhrase {

	public static void main(String[] args) {
		reverse("this is the Phrase that i am going to send");

	}
	
	public static void reverse(String thePhrase) {
		char c;
		String aux="", answer="";
		
		for(int i=0; i<thePhrase.length(); i++) {
			c = thePhrase.charAt(i);
			aux+=c;
			if(c==' ' || i==thePhrase.length()-1) {
				answer= aux+ " "+answer;
				aux="";
			}
		}
		System.out.println(answer);
	}

}
