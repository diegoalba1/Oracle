package Oracle.Oracle;

public class Digitos {

	public static void main(String[] args) {
		numbers(2786);

	}
	
	public static void numbers(int theNumber) {
		int count=0; //ya
		int max=-9999; //ya
		int min=9999; //ya
		int theSum=0; //ya
		int first=0;
		int last=0;
		
		int aux;
		int aux2=0;
		while(theNumber>0) {
			
			aux2=theNumber%10;
			theNumber=theNumber/10;
			
			if(aux2<min)
				min=aux2;
			if(aux2>max)
				max=aux2;
			theSum+=aux2;
			
			if(count==0)
				last=aux2;
			else
				first=aux2;
			
			count++;
		}
		
		System.out.println("number of digits " + count );
		System.out.println("the max value is " + max);
		System.out.println(" the min value is " + min);
		System.out.println("the sum of digits is " + theSum);
		System.out.println("the first digit is " + first);
		System.out.println("the last digit is " + last);
		
	}

}
