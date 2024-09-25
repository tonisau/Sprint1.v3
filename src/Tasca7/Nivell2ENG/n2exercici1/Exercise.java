package Tasca7.Nivell2ENG.n2exercici1;

import ºº

import java.io.FileWriter;
import java.io.IOException;

public class Exercise {

	public static void main(String[] args) {
		Person person = new Person("Raquel", "Barrio");
		String folder;

		Class<Person> personClass = Person.class;

		try {
			JsonSerializable jsonAnnotation = personClass.getAnnotation(JsonSerializable.class);
			folder = jsonAnnotation.jsonFolder();
			FileWriter writer = new FileWriter(folder + "json.json");
			Gson gson = new Gson();
			gson.toJson(person, writer);
			writer.close();
		} catch (SecurityException | IOException e) {
			System.out.println("No se ha podido escribir en el archivo indicado.");
		}
	}
}
