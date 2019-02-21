package hu.training.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Example {

	private static final HashMap<String, String> myMap = new HashMap<String, String>();

	public static void main(String[] args) {
		System.out.println("Nagy Zoltán");
		List<String> myList = new ArrayList<String>();
		String x = new Example().add(1);
		System.out.println(myMethod(x));

	}

	private static String myMethod(String x) {
		return x;
	}

	private String add(int i) {
		return "1";
	}
}
