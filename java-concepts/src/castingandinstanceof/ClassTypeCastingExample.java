package castingandinstanceof;

// TODO: Ezt rendbe kell rakni
public class ClassTypeCastingExample {
	public static void getExamples() {
		System.out.println("\nClass Type Casting Examples:");
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		// automatic upcasting
		Mammal mammal1 = cat;
		Mammal mammal2 = dog;
		System.out.print("mammal1 (which is secretly a cat) speaks: ");
		mammal1.speak();
		System.out.print("mammal1 (which is secretly a dog) speaks: ");
		mammal2.speak();
		// explicit downcasting
		cat = (Cat) mammal1;
		dog = (Dog) mammal2;
		
		// ClassCastException
		// dog = (Dog) mammal1;
		
		System.out.print("cat can purr: ");
		cat.purr();
		System.out.print("cat can speak too: ");
		cat.speak();
		System.out.print("mammal1 (secretly a cat) can speak too: ");
		mammal1.speak();
		System.out.println("mammal1 (secretly a cat) cannot purr :'( ");
		// purr method is undefinied in type Mammal
		//mammal1.purr(); /error
		//(Cat) mammal1.purr(); //így sem működik
	}
	
	
    class CastingExampleClasses {
    	
    	public void test() {
    		Animal a = new Cat();
    	}
        
    	private abstract class Animal {
            
            int health = 100;
            
            abstract public void speak();
            
        }
    
        private abstract class Mammal extends Animal {
    
        }
    
        private class Cat extends Mammal {
    
            @Override
            public void speak() {
                System.out.println("Meow");		
            }
            
            public void purr() {
                System.out.println("purr");
            }
            
        }
    
        private class Dog extends Mammal {
            @Override
            public void speak() {
                System.out.println("Woof");
            }
        }
        
    }
}


