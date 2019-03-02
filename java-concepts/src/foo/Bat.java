package foo;

public class Bat extends Mammal implements Flyable {
	
	private String name;
	private int weight;

	public Bat(String name, int weight) {
		this.name = name;
		this.weight = weight;
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


	@Override
	public void glide() {
		System.out.println("Gliding");
	}

	@Override
	public void fly() {
		System.out.println("Flying around");
	}
	
	@Override
	public void takesCareOfItsOffspring() {
		System.out.println("The bat eating it's children!");
	}
	
}
