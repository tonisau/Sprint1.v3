package Tasca3.Nivell3PRO;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import utilitats.Entrada;

public class App {
	
	private static List<Persona> persones = new ArrayList<Persona>();

	public static void main(String[] args) {
		boolean sortir = false;
		
		do {
			switch(menu()) {
			case 101:
				afegirPersonesDesdeCSV();
				break;
			case 1:
				afegirPersona();
				break;
			case 2:
				Collections.sort(persones, PersonaComparators.nomAZ);
				mostraPersones();
				break;
			case 3:
				Collections.sort(persones, PersonaComparators.nomZA);
				mostraPersones();
				break;
			case 4:
				Collections.sort(persones, PersonaComparators.cognomsAZ);
				mostraPersones();
				break;
			case 5:
				Collections.sort(persones, PersonaComparators.cognomsZA);
				mostraPersones();
				break;
			case 6:
				Collections.sort(persones, PersonaComparators.dni19);
				mostraPersones();
				break;
			case 7:
				Collections.sort(persones, PersonaComparators.dni91);
				mostraPersones();
				break;
			case 0:
				sortir = true;
				System.out.println("adéu siau!");
			}
		}while(!sortir);
		Entrada.close();
	}
	
	

	private static int menu() {
		final String MENU = "101.- Llegir fitxer CSV"
				+ "\n1.- Introduir persona."
				+ "\n2.- Mostrar les persones ordenades per nom (A-Z)."
				+ "\n3.- Mostrar les persones ordenades per nom (Z-A)."
				+ "\n4.- Mostrar les persones ordenades per cognoms (A-Z)."
				+ "\n5.- Mostrar les persones ordenades per cognoms (Z-A)."
				+ "\n6.- Mostrar les persones ordenades per DNI (1-9)."
				+ "\n7.- Mostrar les persones ordenades per DNI (9-1)."
				+ "\n0.- Sortir."
				+ "\nTria una opció: ";
		return Entrada.llegirInt(MENU);
	}
	
	private static void afegirPersona() {
		Persona p = new Persona(Entrada.llegirString("Indica el nom: "),
				Entrada.llegirString("Indica els cognoms: "),
				Entrada.llegirString("Indica el DNI: "));
		if (persones.contains(p)) {
			System.out.println("Ja existeix una persona amb aquest DNI");
		}else {
			persones.add(p);
		}
	}
	
	private static void afegirPersonesDesdeCSV() {
		Path path = null;
		path = askForPath("Indica la ruta del fitxer CSV: ");
		for(Iterator<String[]> ite = (new Csv(path).iterator()); ite.hasNext() ; ) {
			String[] p = ite.next();
			persones.add(new Persona(p[0], p[1], p[2]));
		}
	}
	
	private static void mostraPersones() {
		System.out.println(new Persona("__Nom____", "__Cognom____", "__NIF____"));
		for(Iterator<Persona> ite = persones.iterator(); ite.hasNext(); ) {
			System.out.println(ite.next());
		}
	}
	
	private static Path askForPath(String missatge) {
		Path path = null;
		boolean success = false;
		do {
			String answer = Entrada.llegirString(missatge);
			path = Path.of(answer);
			success = Files.isReadable(path);
			if (!success) {
				path = Path.of(System.getProperty("user.dir") + answer);
				success = Files.isReadable(path);
				if (!success) System.out.println("Ruta no vàlida!");
			}
		}while(!success);
		return path;
	}

}
