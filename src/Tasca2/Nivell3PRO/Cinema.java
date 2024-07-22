package Tasca2.Nivell3PRO;

import Tasca2.Nivell3ENG.ExceptionTakenSeat;
import Tasca2.Nivell3ENG.ExceptionWrongClientName;
import Tasca2.Nivell3ENG.ExceptionWrongRow;
import Tasca2.Nivell3ENG.ExceptionWrongSeat;

import java.util.Scanner;

public class Cinema {
    private static Scanner sc=new Scanner(System.in);

    private int numberRows;
    private int seatsPerRow;
    private SeatsManagement seatsManagement;

    public Cinema(){
        seatsManagement=new SeatsManagement();
        requestInicialData();
    }
    public void start() {
        int option;
        do{
            option=menu();
            switch (option){
                case 1:
                    showSeats();
                    break;
                case 2:
                    showSeatsPerClient();
                case 3:
                    bookSeats();
                    break;
                case 4:
                    cancelSeat();
                    break;
                case 5:
                    cancelSeatsPerClient();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar la aplicación.");
                    break;
                default:
                    System.out.println("Opción invalida. Porfavor, introduce un numero valido");
            }
        }while(option!=0);

    }

    private int menu() {
        System.out.println("\nEscoja la opción deseada: "
                + "\n1. Mostrar todas las butacas reservadas."
                + "\n2. Mostrar todas las butacas reservadas por una persona."
                + "\n3. Reservar una butaca."
                + "\n4. Anular la reserva de una butaca."
                + "\n5. Anular todas las reservas de una persona."
                + "\n0. Salir de la aplicación.");
        System.out.print("Selecciona una opcion: ");
        return sc.nextInt();
    }

    private void requestInicialData() {
        System.out.println("Indroduce el numero de filas: ");
        numberRows=sc.nextInt();
        System.out.println("Indroduce el numero de asientos por fila: ");
        seatsPerRow=sc.nextInt();
        sc.nextLine();
    }

    private void showSeats() {
        if(seatsManagement.getSeats().size()==0){
            System.out.println("No hay ninguna butaca reservada");
        }else{
            for(Seat seat : seatsManagement.getSeats()){
                System.out.println(seat);
            }
        }
    }

    private void showSeatsPerClient() {
        System.out.println("Introduce el nombre de la persona que hizo la reserva:");
        String clientName = sc.nextLine();
        int results = 0;
        for (Seat seat : seatsManagement.getSeats()) {
            if (clientName.equalsIgnoreCase(seat.getClientName())) {
                System.out.println(seat);
                results++;
            }
        }
        if (results == 0) {
            System.out.println("No hay ninguna butaca reservada a nombre de esta persona.");
        }
    }

    private void bookSeats() {
        try {
            int rowNum = enterRow();
            int seatNum = enterSeatNumber();
            String clientName = enterClientName();
            seatsManagement.addSeat(new Seat(rowNum, seatNum, clientName));
        } catch (ExceptionTakenSeat | ExceptionWrongRow | ExceptionWrongSeat | ExceptionWrongClientName e) {
            System.out.println(e.getMessage());
        }
    }
    private int enterRow() throws ExceptionWrongRow {
        System.out.println("Introduce el número de fila:");
        int rowNum = sc.nextInt();
        sc.nextLine();
        if (rowNum >= 1 && rowNum <= numberRows) {
            return rowNum;
        } else {
            throw new ExceptionWrongRow("El número de fila introducido no existe.");
        }
    }
    private int enterSeatNumber() throws ExceptionWrongSeat {
        System.out.println("Introduce el número de asiento:");
        int seatNum = sc.nextInt();
        sc.nextLine();
        if (seatNum >= 1 && seatNum <= seatsPerRow) {
            return seatNum;
        } else {
            throw new ExceptionWrongSeat("El número de asiento introducido no existe.");
        }
    }
    private String enterClientName() throws ExceptionWrongClientName {
        System.out.println("Introduce el nombre del cliente:");
        String clientName = sc.nextLine();
        if (clientName.matches(".*[0-9].*")) {
            throw new ExceptionWrongClientName("El nombre no puede contener números.");
        } else {
            return clientName;
        }
    }
    private void cancelSeat() {
    }

    private void cancelSeatsPerClient() {
    }





}
