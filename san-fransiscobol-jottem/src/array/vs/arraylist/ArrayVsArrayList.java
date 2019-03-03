package array.vs.arraylist;

import java.util.ArrayList;
// https://www.youtube.com/watch?v=sAJUzTjOKng&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=24
// https://www.youtube.com/watch?v=DL9JOUUAGaI&index=26&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm
public class ArrayVsArrayList {

	public static void main(String[] args) {
		
		ArrayVsArrayList a = new ArrayVsArrayList();
		
		String[] simpleArray =  {"cica", "kutya", "kisegér"};
		System.out.println(simpleArray[1]);
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("cica");
		list.add("kutya");
		// Arralist-ben nincsenek üres tárolól.
		// Ha törlünk\hozzáadunk az arraylisthez elemet, akkor dinamikusan változik a méret
		list.remove(0);
		System.out.println(list.get(0));
		
		ArrayList<String> myStringList = new ArrayList<>(1);
		myStringList.add("a");
		myStringList.add("b");
		myStringList.add("g");
		System.out.println(myStringList.get(0));
		
		ArrayList<Animal> cats = new ArrayList();
		Cat cica1 = new Cat();
		cats.add(cica1);
		
		// meg kell győzni a java-t, hogy tényleg komolyan tudjuk, hogy mit csinálunk
		Cat cica2 = (Cat) cats.get(0);
		Dog morzsa = new Dog();
		
		cats.add(morzsa);
		Dog morzsa2 = (Dog) cats.get(1);
		// classCastException: Macskából nem lesz kutya
		// Dog morsza3 = (Dog) cats.get(0);
		
		// objektumok összehasonlítása
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		
		// object hascode
		System.out.println(o1.hashCode());
		System.out.println(o1);
		// osztály meghatározása
		System.out.println(o1.getClass());
		
		// csekkoljuk az osztályt instanceof-al
		for (Animal cat : cats) {
			if (cat instanceof Cat) {
				System.out.println(cat);
			}
		}
		
	}

}
