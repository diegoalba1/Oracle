package Oracle.Oracle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayInt2 {
	public static List<Integer> AFNegatives= new ArrayList<Integer>();
	public static void main(String[] args) {
		Integer [] theValues = {-100,23,-8,-9,9,-8,100,64,-1000,64,-1000};

		findNumbers(theValues);

	}

 static void findNumbers(Integer[] theValues) {
		
		List<Integer> numbers =Arrays.asList(theValues);
		List<Integer> negatives = numbers.stream().filter(x -> x<0).collect(Collectors.toList());
		List<Integer> positives = numbers.stream().filter(x -> x>0).collect(Collectors.toList());
		
		
		negatives.forEach(x -> AFNegatives.add(Math.abs(x)));
		
		AFNegatives.addAll(positives);
		Collections.sort(AFNegatives, Collections.reverseOrder());
		int theNumber=0;
		for(int i=0 ;i<AFNegatives.size()-1;i++) {
			if(AFNegatives.get(i)==AFNegatives.get(i+1)) {
				theNumber=AFNegatives.get(i);
				break;
			}
		}
		
		System.out.println("positivo: " +theNumber + " Negativo: "+ (theNumber)*(-1));
	}

}
