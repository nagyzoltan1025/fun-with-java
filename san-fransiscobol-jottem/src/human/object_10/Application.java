package human.object_10;

/**
 * @author NZ-LENOVO
 * https://www.youtube.com/watch?v=VBfnEJN0dzs&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=11
 * https://www.youtube.com/watch?v=DP863oa_Xg4&list=PLyriihBWoulz2Eb3-FvL5bPXSQ-8poCNm&index=13&t=0s
 */
public class Application {

	public static void main(String[] args) {
		Human first = new Human();
		// itt még nincs név
		System.out.println(first.getName());
		first.setName("Béla");
		// varászsetter meghívása
		first.setName("Géza", 2);
		first.writeMyName();		
		// itt már lett név
		System.out.println(first.getName());
		System.out.println(first.getAge());
		
		Human second = new Human();
		whatHisName(first);
		whatHisName(second);
		whatHisNameTernary(first);
		whatHisNameTernary(second);
		
	}
	
	/*
	 * Írjunk egy metódust, ami paraméterül kap egy human objectet.
	 * Ha van neve kiírja, ha nincs neve kiírja, hogy nincs név.
	 */
	
	static void whatHisName(Human human) {
		 if (human.getName() == null) {
			 System.out.println("nincs neve");
		 } else {
			 System.out.println(human.getName());
		 }
		 	}
	
	static void whatHisNameTernary(Human human) {
		System.out.println(human.getName() == null ? "Nincs neve" : human.getName() );
	}
	
}
