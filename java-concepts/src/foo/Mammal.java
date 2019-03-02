package foo;

public class Mammal extends Animal {

	private static int numberOfMammals;
	
	public Mammal() {
		numberOfMammals++;
	}
	
	public int howManyMammals(){
		return numberOfMammals;
	}
	
	@Override
	public void eat() {
		System.out.println("yum yum");
		
	}
	
	@Override
	public void breed() {
		System.out.println("Banging a female");
	}
	
	public void takesCareOfItsOffspring() {
		System.out.println("Grooming children");
	}

}
