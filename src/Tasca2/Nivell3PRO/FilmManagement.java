package Tasca2.Nivell3PRO;

import java.util.Scanner;

public class FilmManagement {

    private static Scanner sc = new Scanner(System.in);
    byte option;

    public FilmManagement(){
        this.option=option;
    }

    public byte menu() {

        do {
            System.out.println("\nEscoja la opción deseada: "
                    + "\n1. Mostrar todas las butacas reservadas."
                    + "\n2. Mostrar todas las butacas reservadas por una persona."
                    + "\n3. Reservar una butaca."
                    + "\n4. Anular la reserva de una butaca."
                    + "\n5. Anular todas las reservas de una persona."
                    + "\n0. Salir de la aplicación.");
            option = sc.nextByte();
            sc.nextLine();
            if (option < 0 || option > 5) {
                System.out.println("Escoja una opción válida");
            }
        } while (option < 0 || option > 5);
        return option;
    }

}
