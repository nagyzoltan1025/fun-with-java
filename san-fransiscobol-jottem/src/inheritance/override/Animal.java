package inheritance.override;

public abstract class Animal {
	private String name;
	private int weight;
	
	protected void makeSound() {
		System.out.println("AAAAAA");
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
