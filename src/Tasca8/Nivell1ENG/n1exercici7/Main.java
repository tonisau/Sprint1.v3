package Tasca8.Nivell1ENG.n1exercici7;

import java.util.List;
import static Tasca8.Nivell1ENG.n1exercici6.NamesList.getList;

public class Main {

	public static void main(String[] args) {
		List<String> names = getList();
		names.sort((str1, str2) -> str2.length() - str1.length());

		names.forEach(System.out::println);
	}

}
