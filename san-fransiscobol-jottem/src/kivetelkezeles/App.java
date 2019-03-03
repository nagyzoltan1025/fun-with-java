package kivetelkezeles;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) {
		File file = new File("myFile.txt");
		//FileReader fr = new FileReader(file);
		try {
			example();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("ennyi");
		}

	}
	
	public static void example() throws Exception{
		File file = new File("myFile.txt");
		FileReader fr = new FileReader(file);

		
		try{
			int i = 1 / 0;
		} catch (Exception e) {
			System.out.println("Gáz van");
		} finally {
			System.out.println("ennek is véges");
		}
	}

}
