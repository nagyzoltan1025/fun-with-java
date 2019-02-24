package interfaces.constructor;

public class Cat extends Animal implements Pet, Vehicle{

	public Cat() {
		// szülő osztály konstruktora:
		super();
		// szülő osztály metódusára hivatkozások:
		System.out.println(super.getName());
		
	}
	
	public Cat(String name, int weight) {
		this.name = name;
		this.weight = weight;
	}
	
	public Cat(int weight, String name) {
		//this(weight, name);
	}
	
	public void makeSound() {
		System.out.println("meow");
	}

	@Override
	public void hug() {
		System.out.println("Hug");
	}

	@Override
	public void sit() {
		System.out.println("Sit");
		
	}

	@Override
	public void layDown() {
		System.out.println("layDown");
		
	}
	
	@Override
	public void move() {
		System.out.println("Cat tank moved");
	}
}
