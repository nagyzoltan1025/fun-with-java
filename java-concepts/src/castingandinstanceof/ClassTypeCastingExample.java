package castingandinstanceof;

public class ClassTypeCastingExample {
	
	public static void classTypeCastingTest() {
		System.out.println("\nClass Type Casting Examples:");
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// automatic upcasting
		Animal animal1 = cat;
		Animal animal2 = dog;
		System.out.print("mammal1 (which is secretly a cat) speaks: ");
		animal1.speak();
		System.out.print("mammal1 (which is secretly a dog) speaks: ");
		animal2.speak();
		// explicit downcasting
		cat = (Cat) animal1;
		dog = (Dog) animal2;
		
		// ClassCastException
		// dog = (Dog) mammal1;
		
		System.out.print("cat can purr: ");
		cat.purr();
		System.out.print("cat can speak too: ");
		cat.speak();
		System.out.print("mammal1 (secretly a cat) can speak too: ");
		animal1.speak();
		System.out.println("mammal1 (secretly a cat) cannot purr :'( ");
		// purr method is undefinied in type Mammal
		//mammal1.purr(); /error
		//(Cat) mammal1.purr(); //így sem működik
	}
	
	
}


