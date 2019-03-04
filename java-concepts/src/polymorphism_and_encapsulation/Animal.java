package polymorphism_and_encapsulation;

abstract public class Animal {
	public void walking() {
		System.out.println("walking");
	}
	
	public abstract void eat();
	public abstract void breed();
}
