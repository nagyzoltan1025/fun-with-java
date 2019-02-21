package primitivek;

public class primitive {
	
	static byte static_def_val;
	static char char_def_val;
	byte not_static_value;

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=yZlQq2sAsmM&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=4
		System.out.println(char_def_val);
		
		
		{
			byte x = 127;
			// 127
			System.out.println(x++);
			// -128 => x++ eredeti értéket adja vissza, majd növel eggyel.
			System.out.println(x);
			// végtelen ciklus
			/*
			 * for(byte i = 1; i < 128; ++i) { System.out.println(i); }
			 */
			byte y = 1;
			// hiba, 
			//y =  y * 1;
			System.out.println(y * 1000);
			
		}
		
		
		funWithDefaultValues();
		


	}
	
	public static void funWithDefaultValues() {
		System.out.println("");
		
		// -128 - 127
		byte x = 1;
		byte start;
		
		// 1.
		// saját class-ban deklarált statikus változónak van default értéke
		System.out.println(static_def_val);
		
		// 2.
		// saját class-ban deklarált nem statikus változónak van saját értéke, csak először példányosítani kell
		System.out.println(new primitive().not_static_value);
		
		// 3.
		// másik classban deklarált változónak van saját értéke
		System.out.println(new defaultPrimitiveValues().class_val);
		
		// 4.
		// nem statikus class-ban deklarált lokális változónak nem lesz default értéke
		/* 
		try {
			System.out.println(start);
		}  catch (Exception e) {
			System.out.println("Az Error nem Exception asdasdasd");
		}*/
	}

}


class defaultPrimitiveValues {
	
	byte class_val;
}