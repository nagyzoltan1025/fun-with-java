package array.vs.arraylist;

public  final class Dog extends Animal {

	final private  int size; 
	
	public final void bark() {
		System.out.println("Bark bark!");
	}
	
	public Dog() {
		this.size = 0;
	}
	
	public Dog(int size) {
		this.size = size;
	}
}

// final class-t nem lehet kiterjeszteni:
//class vizsla extends Dog {
//	
//}