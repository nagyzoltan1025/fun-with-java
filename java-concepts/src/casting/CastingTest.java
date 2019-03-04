package casting;

public class CastingTest {

	public static void main(String[] args) {
		testPrimitiveCasting();
	}
	
	public static void testPrimitiveCasting() {
		int i = (int) 1000;
		// primitív casting: narrowing
		byte b = (byte) i;
		System.out.println("Casting int "+ i + " to byte " + b );
		// int -> 32 bit; char -> 16 bit = ez narrowing számít elvileg
		char c = (char) i;
		System.out.println("Casting int " + i + " to char " + c);
		// ilyet nem tudok csinálni:
		// boolean boo = (boolean) i;
		// widening, automata módon végigmegy:
		long l = i;
		System.out.println("Casting int " + i + " to long " + l);
		// itt is elméletileg automata módon castol a java:
		double d = l;
		System.out.println("Casting long " + l + " to double " + d);
		float f = l;
		System.out.println("Casting long " + l + " to float " + f);
		
		double doub = 1.1;
		i = (int) doub;
		System.out.println("Casting double " + doub + " to int " + i);
	}
	
	public static void testObjectTypeCasting() {
		// todo 
	}
}
