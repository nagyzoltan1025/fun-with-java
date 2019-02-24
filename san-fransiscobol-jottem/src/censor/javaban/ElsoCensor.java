package censor.javaban;

/**
 * @author NZ-LENOVO
 *  Többnyire az alábbi video alapján készült:
 *  https://www.youtube.com/watch?v=lslff5vz3Nc&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=8
 */
public class ElsoCensor {

	public static void main(String[] args) {
		ElsoCensor ec = new ElsoCensor();
		// teszt
		// 1-re
		System.out.println(ec.censor("Szeretem a kiskutyákat", "kutyákat", "cicákat"));
		// többre
		System.out.println(ec.censor("A kutya egy nagyon szép állat. A cica is nagyon szép ", "szép", "csúnya"));
		// Egyre sem
		System.out.println(ec.censor("Itt nem lesz csere.", "Nincs ilyen string", "Ilyen sem lesz"));

		

	}
	
	/*
	 * Kell egy fg, ami 3 Stringet kap paramérterül és visszatér egy Stringel
	 * A stringben a 2. stringet kicseréli a 3. stringgel
	 * A String paraméterek:
	 * 	Szöveg
	 * 	Mit 
	 * 	Mire
	 */
	
	String censor(String text, String original, String replacement) {
		if (text.contains(original)) {
			return text.replaceAll(original, replacement);
		} else { // ha nem kell cserélni, akkor nem replacelünk.
			return text;
		}
		
	}

}
