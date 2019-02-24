package interfaces.constructor;

// https://www.youtube.com/watch?v=5HxjGA88i3c&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=16
// https://www.youtube.com/watch?v=cbGBptKxti4&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=17


public class Application {

	public static void main(String[] args) {
		Cat macska = new Cat("Jakab", 2);
		
		System.out.println("Név: " + macska.getName() + "\nSúly: " + macska.getWeight() + " kg");
		macska.makeSound();
		macska.move();
		macska.sit();
		
		Cat macska2 = new Cat();
		
		Cat macska3 = new Cat(2, "Berci");
		
	}
	
}