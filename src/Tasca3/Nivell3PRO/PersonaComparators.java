package Tasca3.Nivell3PRO;

import java.util.Comparator;

public class PersonaComparators {
	
	public static Comparator<Persona> nomAZ = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p1.getNom().compareTo(p2.getNom());
		}
	};
	
	public static Comparator<Persona> nomZA = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p2.getNom().compareTo(p1.getNom());
		}
	};
	
	public static Comparator<Persona> cognomsAZ = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p1.getCognoms().compareTo(p2.getCognoms());
		}
	};
	
	public static Comparator<Persona> cognomsZA = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p2.getCognoms().compareTo(p1.getCognoms());
		}
	};
	
	public static Comparator<Persona> dni19 = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p1.getDni().compareTo(p2.getDni());
		}
	};
	
	public static Comparator<Persona> dni91 = new Comparator<Persona>() {
		@Override
		public int compare(Persona p1, Persona p2) {
			return p2.getDni().compareTo(p1.getDni());
		}
	};

}
