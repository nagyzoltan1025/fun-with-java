package stringpool;

public class PoolExample {

	public static void main(String[] args) {
		String s0 = new String("x");
		String s1 = "x";
		String s2 = "x";
		// konstruktor hívás miatt az "x" nem került bele a string pool-ba
		String s3 = new String("x");
		// stringpool-ba bele lett pakolnva az s3 string értéke.
		String s4 = s3.intern();
		
		System.out.println(s1 == s2); // true
		System.out.println(s0 == s1); // false
		System.out.println(s0 == s3); // false
		System.out.println(s4 == s1); // true
		
		System.out.println(s0);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

	}

}

