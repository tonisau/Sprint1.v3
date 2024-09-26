package Tasca8.Nivell1ENG.n1exercici2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Hi");
		array1.add("How");
		array1.add("are");
		array1.add("you");
		array1.add("?");
		
		System.out.println("Array original: " + array1);
		
		System.out.println("Array filtrado: " + filterOAndLength(array1));
	}
	
	private static List<String> filterOAndLength (List<String> strings) {
		return strings.stream()
				.filter(elem -> elem.toLowerCase().contains("o") && elem.length() > 5)
				.toList();
	}
}
