package belso.osztaly.anonim.osztaly;

// https://www.youtube.com/watch?v=LOUBsUKRHSk&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=30
/*
 * Belső osztály példa
 * Van egy ház osztály
 * Abban lakik egy kutya
 * Ahhoz hogy a kutyát elérjük szükség arra, hogy a háznak legyen egy metódusa, ami kapcsolatba tud lépni a privát kutya
 * osztállyal
 * 
 * Anonim osztály
 */
public class App {
	
	public static void main(String[] args) {
		
		// belső osztály használata
		House house = new House();
		house.myDog();
		
		// anonim osztály példa:
		// A house hellp metódusa egy Message típust vár paraméterként
		// Message típusunk azonban csak interface formájában van jelen
		// Kérdés, hogy akkor hogy lesz a helló metódusnak Message típusú objekt paramétere?
		// úgy, hogy létrehozunk egy anonim osztályt
		// formája: new Osztály {törzs} 
		// törzsben override-oljuk az interface-nek a greet-jét és mindenki boldog.
		// csak ez az egész megoldás tűnik egy hatalmas túlbonyolított faszságnak
		// ennek mi értelme van?
		house.hello(new Message() {
			public String greet() {
				return "hello én egy anonim osztály vagyok";
			}
		});

		
	}

}

class House {
	
	private int s = 1;
	
	private class Dog {
		
		void bark() {
			System.out.println("én egy beslő kutya osztály vagyok, bark, bark .." + s);
		}
	}
	
	public void myDog() {
		Dog dog = new Dog();
		dog.bark();
	}
	
	public void hello(Message m) {
		System.out.println(m.greet());
	}
	


}


interface Message {
	String greet();
}