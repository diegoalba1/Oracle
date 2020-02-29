package Oracle.Oracle;

public class ToString2 {

	public static void main(String[] args) {
		int theNumber=-2345;
		char sign =0;
		int size=5;
		int index=size;
		char []buff = new char[size];
		int n;
		
		if(theNumber<0) {
			sign='-';
			theNumber=-theNumber;
		}
		
		while(theNumber!=0) {
			n=theNumber/10;
			buff[--index] = (char) (theNumber%10 + 48);
			theNumber=n;
		}
		if(sign != 0){
            buff[--index] = sign;
        }
        System.out.println(String.valueOf(buff)); 
	}

}
