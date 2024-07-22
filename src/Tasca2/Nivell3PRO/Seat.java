package Tasca2.Nivell3PRO;

import java.util.Objects;

public class Seat {

    private int row;
    private int seatNumber;
    private String clientName;

    public Seat(int row, int seatNumber, String client){
        this.row=row;
        this.seatNumber=seatNumber;
        this.clientName=client;
    }

    public int getRow(){
        return row;
    }
    public int getSeatNumber(){
        return seatNumber;
    }
    public String getClientName(){
        return clientName;
    }

    public int hashCode() {
        return Objects.hash(seatNumber, row);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Seat other = (Seat) obj;
        return seatNumber == other.seatNumber && row == other.row;
    }

    public String toString() {
        return "Row: " + row + ", Seat number: " + seatNumber + ", Client Name: " + clientName;
    }


}
