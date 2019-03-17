package casting;

public class PrimitiveCastingExample {

	public static void main(String[] args) {
		int i = (int) 1000;
		// primitív casting: narrowing
		byte b = (byte) i;
		System.out.println("Casting int "+ i + " to byte " + b );
		// int -> 32 bit; char -> 16 bit = ez narrowing számít
		char c = (char) i;
		System.out.println("Casting int " + i + " to char " + c);
		// boolean boo = (boolean) i; // error
		// widening, automatikus
		long l = i;
		System.out.println("Casting int " + i + " to long " + l);
		double d = l;
		System.out.println("Casting long " + l + " to double " + d);
		float f = l;
		System.out.println("Casting long " + l + " to float " + f);
		
		double doub = 1.1;
		i = (int) doub;
		System.out.println("Casting double " + doub + " to int " + i);
	}
	
}
