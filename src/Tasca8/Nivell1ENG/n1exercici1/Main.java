package Tasca8.Nivell1ENG.n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> array1 = new ArrayList<String>();
		array1.add("Hi");
		array1.add("How");
		array1.add("are");
		array1.add("you");
		array1.add("?");
		
		System.out.println("Array original: " + array1);

		System.out.println("Array filtrado: " + filterO(array1));
	}
	
	private static List<String> filterO (List<String> strings) {
		return strings.stream()
				.filter(elem -> elem.toLowerCase().contains("o"))
				.toList();
	}
}
