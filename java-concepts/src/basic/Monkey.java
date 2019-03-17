package basic;

public class Monkey extends Mammal{
	
	public void mimic(String s) {
		System.out.println(s);
	}
	
	public void mimic(int i) {
		System.out.println(i + 10);
	}

}
