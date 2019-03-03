package veletlen.mondat.generator;

public class Generator {

	private String[] firstWord = {"Nagyon jó", "Kiváló", "Legeslegjobb", "Tökéletes", "Megbízható"};
	private String[] secondWord = {"megoldás", "lehetőség", "kivitelezés"};
	private String[] thirdWord = {"neked!", "mindenkinek!", "az egész világnak!", "még a földönkívülieknek is!"};
	 
	
	public String generate() {
		
		return getRandomStringArrayElement(firstWord) + 
				" " +
				getRandomStringArrayElement(secondWord) +
				" " +
				getRandomStringArrayElement(thirdWord);
	}
	
	private String getRandomStringArrayElement(String[] stringArray) {
		return stringArray[getRndInt(stringArray.length)];
	}

	
	/*
	 * Math.random() metódus 0 és 0.9999+ között add vissza számokat
	 * 1-es soha nem ad vissza
	 * Ez a range kitolható úgy, hogy egy számmal megszorozzuk a visszatérési értéket.
	 * Mivel nekünk egész számokra van szükségünk, ezért castolnunk kell a double-t int-re
	 * pl.:
	 * 0.1 * 5 = 0.5 => 0
	 * 0.9 * 5 = 4.5 => 4
	 */
	private int getRndInt(int range) {
		
		return (int) (Math.random() * range);
		
	}
	
}
