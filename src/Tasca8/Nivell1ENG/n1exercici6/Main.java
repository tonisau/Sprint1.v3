package Tasca8.Nivell1ENG.n1exercici6;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> names = NamesList.getList();
		names.sort((str1, str2) -> str1.length() - str2.length());
		
		names.forEach(System.out::println);
	}

}
