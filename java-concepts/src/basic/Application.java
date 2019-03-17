package basic;

/* 
 * Létrehoztam az alábbiakat:
 *  Abstract osztály: Animal
 *  Interface: Flyable
 *  Osztályok: 
 *  	Mammal, számolja, hogy hányszor lett példányosítva.
 *  	Bat, Mammal gyermeke, Flyable-t implementálja, override-ol Mammal metódusokat
 *  	Monkey, Mammal gyermeke
 *  Az osztályoknak:
 *  	Az osztály szintű változói private-ok
 *  	Van saját konstruktoruk
 *  	Van getterük és setterük
 *  
 *  Polimorfizmus
 *  Overload (statikus polimorfizmus??)
 *  Override (dinamikus polimorfizmus??)
 */


public class Application {
	
	public static void main(String[] args) {
		// osztály példányosítás
		Bat myBat = new Bat("Béla", 12);
		Monkey myMonkey = new Monkey();
		
		// method call + encapsulation:
		// myBat.name; // error
		myBat.setName("Aladár");
		System.out.println("A denevérem új neve: " + myBat.getName());
		
		
		// statikus változó
		System.out.println("Hány emlősöm példányom van? " + myBat.howManyMammals());
		
		// polymorfizmus: A denevérem egyszerre Bat és Mammal is
		behaviourWithOffsprings(myBat);
		behaviourWithOffsprings(myMonkey);
		// overloading:
		myMonkey.mimic(1);
		myMonkey.mimic("Hello");
		
	}
	
	public static void behaviourWithOffsprings(Mammal myMammal) {
		myMammal.takesCareOfItsOffspring();
	}
	


}
