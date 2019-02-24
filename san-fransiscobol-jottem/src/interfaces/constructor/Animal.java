package interfaces.constructor;

public abstract class Animal {
	protected String name;
	protected int weight;
	
	public void makeSound() {
		System.out.println("AAAAA");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getWeight() {
		return weight;
	}
	
	public void setWeight(int weight) {
		this.weight = weight;
	}
	
}
