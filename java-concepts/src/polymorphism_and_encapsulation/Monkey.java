package polymorphism_and_encapsulation;

public class Monkey extends Mammal{
	
	public void ape(String s) {
		System.out.println(s);
	}
	
	public void ape(int i) {
		System.out.println(i + 10);
	}

}
