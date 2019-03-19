package castingandinstanceof;

class Dog extends Animal implements Predator {
	
	private String name;
	
	Dog(){
		this.name = null;
		System.out.println("Creating a nameless " + this.getClass().getSimpleName());
	}
	
	Dog(String name){
		this.name = name;
		System.out.println("Creating " + name);
	}
	
	String getName() {
		return this.name;
	}
	
	public void speak() {
		System.out.println("Woof");
	};
	
}