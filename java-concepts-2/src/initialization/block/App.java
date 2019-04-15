package initialization.block;

/* Java inicializációs sorrend vizsgálata:
 * Létre lett hozva egy InitParentExample osztály InitChildExample osztály, mely kiterjeszti a InitParentExample-t.
 * A két osztály tartalmaz:
 * 2 db statikus inicializáló blokkot
 * 2 db példány inicializákó blokkot
 * 1 konstruktort
 * 
 * Bővítve:
 * Abstract osztállyal:
 * 1 db statikuc inicializáló blokk
 * 1 db példány inicializáló blokk
 * 1 db konstruktor
 */

public class App {

	public static void main(String[] args) {
		InitChildExample myInit = new InitChildExample();
		System.out.println(myInit.i);
		System.out.println(myInit.myStaticI);
	}
}
