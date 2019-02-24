package human.object_10;

public class Human {
	private String name;
	private int age;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	/** Ez a metódus kiírja az ember nevét. */
	void writeMyName() {
		System.out.println(getName());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	// Ez a metódus még setternek minősül?
	// Mit tekintünk tulajdonképpen setternek?
	public void setName(String trueName, int i) {
		this.name = trueName + i;
	}


	
}
