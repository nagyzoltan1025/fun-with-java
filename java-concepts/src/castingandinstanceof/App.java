package castingandinstanceof;

public class App {

	public static void main(String[] args) {
		primitiveTypeCastingExampleSimple();
		// primitiveTypeCastingExample();
	}
	
	/*
	 * Szinte ugyanaz, mint aprimitiveTypeCastingExample, csak nem használok változóneveket fölöslegesen.
	 */
	public static void primitiveTypeCastingExampleSimple() {
		System.out.println("\nPrimitive Type Casting Examples:");
		System.out.println("Explicit narrowing examples: ");
		System.out.println("Casting integer to integer: 1000 -> (int) 1000; Result: " + (int) 1000 );
		// primitive casting: Explicit narrowing
		System.out.println("Casting int to byte: " + 1000 + " => " + (byte) 1000 );
		// int -> 32 bit; char -> 16 bit => explicit narrowing
		System.out.println("Casting int to byte: " + 1000 + " => " + (char) 1000 );
		System.out.println("Casting double to int: " + 1.1 + " => " + (int) 1.1 );
		
		// boolean boo = (boolean) i; // error
		System.out.println(("Casting int to boolean causes error."));
		
		// automatic widening:
		int i = 1000;
		long l = i;
		double d = l;
		float f = l;
		System.out.println("Automatic Widening Examples: ");
		System.out.println("Casting int to long: " + i + " => " + l );
		System.out.println("Casting long to double: " + l + " => " + d );
		System.out.println("Casting long to float: " + l + " => " + f );
	}
	
	
	public static void primitiveTypeCastingExample() {
		System.out.println("\nPrimitive Type Casting Examples:");
		int i = (int) 1000;
		// primitív casting: narrowing
		byte b = (byte) i;
		System.out.println("Casting int "+ i + " to byte " + b );
		// int -> 32 bit; char -> 16 bit => explicit narrowing
		char c = (char) i;
		System.out.println("Casting int " + i + " to char " + c);
		// boolean boo = (boolean) i; // error
		// automatic widening:
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
