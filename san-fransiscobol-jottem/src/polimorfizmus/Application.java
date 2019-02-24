package polimorfizmus;

// https://www.youtube.com/watch?v=v5hz6HFnmGg&index=15&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&t=0s
// ha az encapsulation olyan fontos dolog, akkor a java miért engedi, hogy egy osztály
// tulajdonságai mások legyenek mint private?
// van olyan eset, amikor jó gyakorlat az, hogy egy objektum mezőit közvetlen
// pöcögtetjük meg?

public class Application {

	public static void main(String[] args) {
		Cat macska = new Cat();
		
		macska.setName("Cirmos");
		macska.meow();
		System.out.println(macska.getName());
		
		// magic: 
		// Ez tök jó, hogy lehet ilyet csinálni, csak mi a poén benne
		// van olyan szitu, amikor a Cat helyett nekem Animal kell?
		// Háát mondjuk elképzelhető
		// Lenne egy macska meg egy kutya gyermeke az állat osztálynak
		// és én írni akarok egy olyan metódust, aminek ha átadom a kutyát, akkor azzal tud dolgozni
		// de ha a macskát adom át azzal is.
		// magyarán én egy metódussal két legyet is akarok ütni, akkor ezt megtehetem..
		Animal tigris = macska;
		System.out.println(tigris.getName());
		// nem meglepő módon ez nem működik.
		// tigris.meow();
		
		tigris.setName("Tigger");
		System.out.println(tigris.getName() + " " + macska.getName());
		// Ez true lesz
		// a tigris és a macska a heapben ugyanarra az objectre mutat.
		// viszont a tigris nem tud hozzáférni a Cat osztály tulajdonságaihoz és viselkedéséhez
		// pedig az objektumnál ott van. Érdekes. 
		// Analógia: Titkos katonai intézményben a közlegényt mágneskártyájával csak az első szintig tud lejutni és körbenézni
		// a tábornokéval viszont a 2. szinthez is hozzá tud férni, ahol már a haditerveket tartják :)
		System.out.println(tigris.equals(macska));
		System.out.println(tigris);
		System.out.println(macska);
		
		Animal leopard = new Animal();
		// Ez viszont így nem tud működni
		// a heapá-ben létrejött a leopard objektum
		// de az animal-ból nem lehet Cat.
		// magyarán mi csak felfele tudunk lépkedni.
		// Azaz én itt a közlegény mágneskártyájával akarnék hozzáférni a haditervekhez
		// A java ilyenkor szól, hogy az úgy nem fog menni.
		// Cat macska3 = leopard;
		
		

	}
	


}
