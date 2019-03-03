package interju.kerdesek;

import interfaces.constructor.Cat;

// https://www.youtube.com/watch?v=pUXCdCOAPI4&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=18
// https://www.youtube.com/watch?v=xinuYU-cHNY&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=19
public class app {

	public static void main(String[] args) {
		vid19();
		refFoo();
		
		// még egy kis példa kasztolásra
		Integer i = 2;
		String something = i.toString();
		
		double d = 3.4;
		int it = (int) d;
		

		
	}
	
	public static void vid19() {
		String third;
		int i = 1;
		third = String.valueOf(i);
		
		// wrapperek:
		// ez itt egy wrapper
		// primitíveket csomagol be egy objektumba
		// utánna tudunk mindenféle object cuccokat hivogatni
		Character c = 'c'; 
		char myChar = 'x';
		wrapping(myChar);
		
	}
	
	public static void refFoo() {
		Cat cat1 = new Cat("Fluffy", 12);
		Cat cat2 = cat1;
		cat1.setName("Joe");
		
		System.out.println(cat1.getName() + " " + cat2.getName());
	}
	
	public static void wrapping(Character c) {
		System.out.println(c);
	}
	
	public void vid18() {
		// print és println különbség
		System.out.print(1 + 1 + "a" + 1);
		System.out.println(1 + 1 + "a" + 1 + "println vége");
		
		// változók típusok és konverziók:
		
		// kissebb irányba nem mozoghatunk:
		// int i = 1;
		// byte  x = i;
		
		// nagyobb lehet:
		byte x = 1;
		int i = x;
		
		//számmal nem kezdünk változónevet:
		//int 1x;
		
		//String esetén:
		String s;
		int myInt = 1;
		char myChar = 'a';
		// így pl tud működni
		s = "" + myInt;
		s = "" + myChar; 
		// így viszont nem tud:
		//s = myInt;
		//s = myChar
		
		// double:
		double myDouble = 3.5;
		float myFloat = 2.0f;
		// double-ből nem lehet int
		// x = myDouble;
		myDouble = myFloat;
		// floatból nem lehet double
		// myFloat = myDouble;
		
		// tanulság:
		// nagyobb range-ű típusból mehetünk kisebb-be
		// kisebb range-ű változóból mehetünk nagyobba
	}

}
