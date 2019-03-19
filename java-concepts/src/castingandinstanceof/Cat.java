package castingandinstanceof;

class Cat extends Animal implements Predator {
	
	public void speak() {
		System.out.println("Meow");
	}
	
	public void purr() {
		System.out.println("Purr");
	}
}