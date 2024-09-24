package Tasca8.Nivell1ENG.n1exercici1;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<String> array1 = new ArrayList<String>();
		array1.add("hOla");
		array1.add("que");
		array1.add("tal");
		array1.add("hasta");
		array1.add("luego");
		
		System.out.println("Array original: " + array1);

		System.out.println("Array filtrado: " + filterO(array1));
	}
	
	private static List<String> filterO (List<String> strings) {
		return strings.stream()
				.filter(elem -> elem.toLowerCase().contains("o"))
				.toList();
	}
}
