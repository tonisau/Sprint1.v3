package Tasca7.Nivell2ENG.n2exercici1;

import java.io.Serializable;

@JsonSerializable(jsonFolder = "B:\\MIS DOCUMENTOS\\AAA POR HACER\\ITACADEMY\\Sprint1.v3\\src\\Tasca7\\Nivell2ENG\\n2exercici1")
public class Person implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private String lastName;

	public Person(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastName=" + lastName + "]";
	}
}
