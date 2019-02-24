package primitivek;


/**
 * @author NZ-LENOVO
 * primitív változók deklarálása
 * alapértelmezett érték beállítás megértése
 */
public class Primitive {
	
	static byte static_def_val;
	static char char_def_val;
	byte not_static_value;

	public static void main(String[] args) {
		// https://www.youtube.com/watch?v=yZlQq2sAsmM&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=4
		// valójában a videoban nincs kódolás, viszont pár dolgot kipróbáltam
		// pl.: primitívek és a default value
		
		
		// statikus metódust meghívtuk
		funWithDefaultValues();
		
		// osztály saját nem statikus metódusát akarjuk meghívni.
		// Ehhez először példányosítani kell az osztályt a saját main függvényében
		// Egyébként azt nem értem, hogy miért engedi a java ezt.
		Primitive p = new Primitive();
		p.funWithBytes();
		
		
		// Egy kis kókányolás:
		// Itt hívok egy konstruktort, ami feltehetőleg létrehoz egy objectet a heapben
		// objektnek meghívásra kerül a funWithBytes metódusa
		// lefutás után még él az object a heap-ben, amíg a Garbage collector meg nem eszi gondolom
		// node erre az objektumra elvileg nincs hivatkozás, nem?
		// szóval ezt az objectet bármikor ledarálhatná garbage collector...
		new Primitive().funWithBytes();
		System.out.println("A fenti object meghal mire a vezérlés erre a sorra ér?");
		

	}
	
	public void funWithDefCharValue() {
		System.out.println(char_def_val);
	}
	
	public void funWithBytes() {
		byte x = 127;
		// 127
		System.out.println(x++);
		// -128 => x++ eredeti értéket adja vissza, majd növel eggyel.
		System.out.println(x);
		// végtelen ciklus
		// byte soha nem lesz 127. Viszont túlcsordulni sem tud, mivel 127 + 1 = -128
		/*
		 * for(byte i = 1; i < 128; ++i) { System.out.println(i); }
		 */
		byte y = 1;
		// hiba, 
		//y =  y * 1;
		System.out.println(y * 1000);		
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
		System.out.println(new Primitive().not_static_value); 
		
		// 3.
		// másik classban deklarált változónak van saját értéke
		System.out.println(new defaultPrimitiveValues().class_val);
		
		// 4.
		// nem statikus class-ban deklarált lokális változónak nem lesz default értéke
//		try {
//			System.out.println(start);
//		}  catch (Exception e) {
//			System.out.println("Az Error nem Exception asdasdasd");
//		}
		
	}

}

/*
 * Ez az osztály annak a szemléltetésére kell, hogyha egy másik osztályban van egy primitív típus, aminek nincs beállítva semmilyen érték
 * és ezt az osztályt példányosítjuk, akkor a primitív típus kapni fog egy alapértelmezett értéket.
 */

class defaultPrimitiveValues {
	
	byte class_val;
}