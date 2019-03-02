package foo;

/* todo:
Hozz létre egy absztrakt osztály.
Hozz létre egy interfacet-t.
Hozz létre egy osztályt, ami kiterjeszti az absztrakt osztályt
Hozz létre egy másik osztályt ami kiterjeszti a fenti osztályt és megvalósítja a az interfacet-t.

Encapsulation
Az osztályoknak legyen:
    private változói
    konstruktora
    gettere és settere
    
 
Polimorfizmus:
    legyen két olyan metódusa, ami overloadolja a másikat
    Gyermek osztály-t kapja paraméterül egy metódus, ami szülőt vár
 */


public class Application {
	
	public static void main(String[] args) {
		// osztály példányosítás
		Bat myBat = new Bat("Béla", 12);
		Monkey myMonkey = new Monkey();
		
		// method call + encapsulation:
		myBat.setName("Aladár");
		System.out.println("A denevérem új neve: " + myBat.getName());
		
		// statikus változó
		System.out.println("Hány emlősöm példányom van? " + myBat.howManyMammals());
		
		// polimorfizmus:
		// 1 db metódust írtam, amely képes a monkey és a bat típusokat is kezelni:
		behaviourWithOffsprings(myBat);
		behaviourWithOffsprings(myMonkey);
		// overloading:
		myMonkey.ape(1);
		myMonkey.ape("Hello");
		
	}
	
	public static void behaviourWithOffsprings(Mammal myMammal) {
		myMammal.takesCareOfItsOffspring();
	}
	


}
