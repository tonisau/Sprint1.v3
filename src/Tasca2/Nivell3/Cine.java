package Tasca2.Nivell3;

import java.util.Iterator;
import java.util.Scanner;

public class Cine {
    private int files;
    private int seientsPerFila;
    private GestioButaques gestioButaques;
    private Scanner scanner;

    public Cine() {
        gestioButaques = new GestioButaques();
        scanner = new Scanner(System.in);
        demanarDadesInicials();
    }

    public void iniciar() throws ExcepcioNomPersonaIncorrecte {
        int opcio;
        do {
            opcio = menu();
            switch (opcio) {
                case 1:
                    mostrarButaques();
                    break;
                case 2:
                    mostrarButaquesPersona();
                    break;
                case 3:
                    reservarButaca();
                    break;
                case 4:
                    anularReserva();
                    break;
                case 5:
                    anularReservaPersona();
                    break;
                case 0:
                    System.out.println("Sortint de l'aplicació...");
                    break;
                default:
                    System.out.println("Opció invàlida. Si us plau, introdueix un número vàlid.");
            }
        } while (opcio != 0);
    }

    private int menu() {
        System.out.println("\nMenú:");
        System.out.println("1.- Mostrar totes les butaques reservades.");
        System.out.println("2.- Mostrar les butaques reservades per una persona.");
        System.out.println("3.- Reservar una butaca.");
        System.out.println("4.- Anul·lar la reserva d'una butaca.");
        System.out.println("5.- Anul·lar totes les reserves d'una persona.");
        System.out.println("0.- Sortir.");
        System.out.print("Selecciona una opció: ");
        return scanner.nextInt();
    }

    private void mostrarButaques() {
        System.out.println("Butaques reservades:");
        for (Butaca butaca : gestioButaques.getButaques()) {
            System.out.println(butaca);
        }
    }

    private void mostrarButaquesPersona() {
        //String persona = introduirPersona();
        //System.out.println("Butaques reservades per " + persona + ":");
        System.out.println("Butaques reservades per: ");
        String persona= scanner.nextLine();
        int results=0;
        for (Butaca butaca : gestioButaques.getButaques()) {
            if (butaca.getPersona().equals(persona)) {
                System.out.println(butaca);
                results++;
            }
        }
        if (results == 0) {
            System.out.println("No hay ninguna butaca reservada a nombre de esta persona.");
        }
    }

    private void reservarButaca() {
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            String persona = introduirPersona();
            Butaca butaca = new Butaca(fila, seient, persona);
            gestioButaques.afegirButaca(butaca);
            System.out.println("Butaca reservada correctament.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void anularReserva() {
        try {
            int fila = introduirFila();
            int seient = introduirSeient();
            gestioButaques.eliminarButaca(fila, seient);
            System.out.println("Reserva anul·lada correctament.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void anularReservaPersona() throws ExcepcioNomPersonaIncorrecte {
        String persona = introduirPersona();
        gestioButaques.eliminarButacaPersona(persona);
        System.out.println("Reserves de la persona " + persona + " anul·lades correctament.");
    }

    private void demanarDadesInicials() {
        System.out.print("Introdueix el nombre de files: ");
        files = scanner.nextInt();
        System.out.print("Introdueix el nombre de seients per fila: ");
        seientsPerFila = scanner.nextInt();
    }

    private int introduirFila() throws ExcepcioFilaIncorrecta {
        System.out.print("Introdueix el número de fila: ");
        int fila = scanner.nextInt();
        if (fila < 1 || fila > files) {
            throw new ExcepcioFilaIncorrecta("Fila incorrecta. Ha d'estar entre 1 i " + files);
        }
        return fila;
    }

    private int introduirSeient() throws ExcepcioSeientIncorrecte {
        System.out.print("Introdueix el número de seient: ");
        int seient = scanner.nextInt();
        if (seient < 1 || seient > seientsPerFila) {
            throw new ExcepcioSeientIncorrecte("Seient incorrecte. Ha d'estar entre 1 i " + seientsPerFila);
        }
        return seient;
    }

    private String introduirPersona() throws ExcepcioNomPersonaIncorrecte {
        System.out.print("Introdueix el nom de la persona: ");
        scanner.nextLine(); // netejar buffer
        String persona = scanner.nextLine();
        if (!persona.matches("[a-zA-Z ]+")) {
            throw new ExcepcioNomPersonaIncorrecte("Nom de persona incorrecte. Només pot contenir lletres i espais.");
        }
        return persona;
    }
}
