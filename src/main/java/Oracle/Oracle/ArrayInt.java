package Oracle.Oracle;

public class ArrayInt {

	public static void main(String[] args) {
		int [] theValues = {-99,99,-8,8};

		findNumbers(theValues);
	}

	public static void findNumbers(int[] theValues) {
		
		String cadena="";
		for(int number : theValues) {
			cadena=cadena+number+" ";
		}
		int theNumber=-100;
		for(int number : theValues) {
			if(number >0) {
				if(cadena.contains(Integer.toString(((number)*(-1))))) {
					if(number>theNumber) {
						theNumber=number;
					}
				}
			}
		}
		System.out.println("Positivo: "+ theNumber + " negativo:" +(theNumber)*(-1));
	}
	
	
}
