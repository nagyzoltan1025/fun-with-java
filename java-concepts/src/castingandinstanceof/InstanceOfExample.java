package castingandinstanceof;

public class InstanceOfExample {

	
	public static void instanceofTest() {
		System.out.println("\ninstanceof Examples: ");
		Dog myDog = new Dog("Morzsa");
		Bulldog myBulldog = new Bulldog("Bulldog Bill");
		Animal myAnimalDog = new Dog();
		Dog myNullDog = null;
		Dog myNotInitializedDog;
		int myInt = 1;
		System.out.println( myDog.getName() + " is a dog? " + (myDog instanceof Dog)); // true
		System.out.println( myDog.getName() + " is a predator? " + (myDog instanceof Predator)); // true
		System.out.println( myDog.getName() + " is an Animal? " + (myDog instanceof Animal)); // true
		System.out.println( myDog.getName() + " is a Bulldog? " + (myDog instanceof Bulldog)); // false
		System.out.println( myBulldog.getName() + " is a Dog? " + (myDog instanceof Bulldog)); // true 
		System.out.println( myBulldog.getName() + " is a Dog? " + (myDog instanceof Bulldog)); // true
		System.out.println( myAnimalDog.getClass().getTypeName()
							+ " (a nameless animal dog) is a Dog? " 
							+ (myAnimalDog instanceof Dog)); // false
		System.out.println( myAnimalDog.getClass().getTypeName() 
							+ " (a nameless animal dog) is a cat? " 
							+ (myAnimalDog instanceof Cat)); // false
		System.out.println(myNullDog + " (myNullDog) is a Dog? " + (myNullDog instanceof Dog)); // false
		System.out.println(myDog.getName() + "is a Herbivore? " + (myDog instanceof Herbivore)); //false
		System.out.println(myDog instanceof Herbivore); // false
		System.out.println(myDog.getName() + " is a cat? That made java so angry that it is caused an error." );
		// System.out.println(myDog instanceof Cat); // error
		System.out.println("myNotInitializedDog is a Dog? That made java so angry that it is caused an error." );
		// System.out.println(myNotInitializedDog instanceof Dog); //error
		System.out.println("A primitive integer value is an Integer? That made java so angry that it is caused an error." );
		// System.out.println(myInt instanceof Integer); error
		
	}

	
	
}