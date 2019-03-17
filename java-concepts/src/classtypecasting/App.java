package classtypecasting;

public class App {

	public static void main(String[] args) {
		Cat cat = new Cat();
		Dog dog = new Dog();
		// automatic upcasting
		Mammal mammal1 = cat;
		Mammal mammal2 = dog;
		mammal1.speak();
		mammal2.speak();
		// explicit downcasting
		cat = (Cat) mammal1;
		dog = (Dog) mammal2;
		
		// ClassCastException
		// dog = (Dog) mammal1;
		
		
		cat.purr();
		cat.speak();
		mammal1.speak();
		// purr method is undefinied in type Mammal
		//mammal1.purr();
		//(Cat) mammal1.purr(); //így sem működik

	}

}
