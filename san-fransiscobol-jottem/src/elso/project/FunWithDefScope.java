package elso.project;

class FunWithDefScope {
	
	String fact = "Ez egy default láthatósággal rendelkező osztály. A package-ben látszik. A package-en kívül nem";
	
	void defScopeMethod(){
		System.out.println("Ezt a metódust default láthatóságú");
	}
}
