package instanceofexample;

public class InstanceOfExample {

	public static void main(String[] args) {
		Dog myDog = new Dog();
		Cat myCat = new Cat();
		Animal myAnimalDog = new Dog();
		Dog myNullDog = null;
		Dog myNotInitializedDog;
		int myInt = 1;
		
		System.out.println(myDog instanceof Dog); //true
		System.out.println(myDog instanceof Predator); //true
		System.out.println(myDog instanceof Animal); //true
		System.out.println(myDog instanceof Bulldog); //false
		System.out.println(new Bulldog() instanceof Dog); //true
		System.out.println(myAnimalDog instanceof Cat); //false
		System.out.println(myNullDog instanceof Dog); // false
		System.out.println(myDog instanceof Herbivore); // false
		// System.out.println(myDog instanceof Cat); // error
		// System.out.println(myNotInitializedDog instanceof Dog); //error
		// System.out.println(myInt instanceof Integer); error

		
	}
	
	
}


class Animal {

}

interface Predator {
	
}

interface Herbivore {
	
}

class Dog extends Animal implements Predator {
	
}

class Bulldog extends Dog {
	
}

class Cat extends Animal implements Predator {
	
}
