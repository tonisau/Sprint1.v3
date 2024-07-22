package Tasca2.Nivell3PRO;


import Tasca2.Nivell3ENG.ExceptionTakenSeat;

import java.util.ArrayList;
import java.util.Collection;

public class SeatsManagement {
    private ArrayList<Seat> seats;

    public SeatsManagement() {
        seats = new ArrayList<Seat>();
    }

    public ArrayList<Seat> getSeats() {
        return seats;
    }

    public void addSeat(Seat seat) throws ExceptionTakenSeat {
        if (searchSeat(seat.getRow(), seat.getSeatNumber()) >= 0) {
            throw new ExceptionTakenSeat("El asiento seleccionado no se encuentra disponible.");
        }
        seats.add(seat);
        System.out.println("Butaca reservada satisfactoriamente.");
    }


    private int searchSeat(int row, int seatNumber) {
        int seatIndex = -1;
        Seat searchedSeat = new Seat(row, seatNumber, "");
        for (int i = 0; i < seats.size() && seatIndex < 0; i++) {
            if (searchedSeat.equals(seats.get(i))) {
                seatIndex = i;
            }
        }
        return seatIndex;
    }
}
