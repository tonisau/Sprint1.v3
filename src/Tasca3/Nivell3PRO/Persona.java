package Tasca3.Nivell3PRO;

public class Persona {
	
	private String nom;
	private String cognoms;
	private String dni;
	
	public Persona (String nom, String cognoms, String dni) {
		if (nom == null | cognoms == null | dni == null) {
			throw new NullPointerException("S'ha intentat crear una persona amb un atribut NULL");
		}
		this.nom = nom;
		this.cognoms = cognoms;
		this.dni = dni;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getCognoms() {
		return this.cognoms;
	}
	
	public String getDni() {
		return this.dni;
	}
	
	@Override
	public boolean equals (Object o) {
		return ((Persona) o).dni.equals(this.dni);
	}
	
	@Override
	public int hashCode() {
		return this.dni.hashCode();
	}
	
	@Override
	public String toString() {
		return String.format("%s%s%s", afegeixEspais(this.nom, 30), afegeixEspais(this.cognoms, 30), this.dni);
	}
	
	private static String afegeixEspais(String s, int x) {
		return s + " ".repeat(x - s.length() > 0 ? x - s.length() : 0);
	}

}
