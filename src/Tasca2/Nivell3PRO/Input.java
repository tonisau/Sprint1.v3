package Tasca2.Nivell3PRO;

import static Tasca2.Nivell3PRO.InputCheck.*;
import static Tasca2.Nivell3PRO.InputCheck.readString;

public class Input {

    private int numInt;
    private String clientName;

    public Input(int numInt, String clientName) {
            this.numInt=numInt;
            this.clientName=clientName;
    }
        // Provar els mètodes
        byte edat = readByte("Introdueix la teva edat:");

        int enter = readInt(numInt);


        float decimal = readFloat("");


        double decimalGran = readDouble("Introdueix un número decimal (double):");


        char car = readChar("Introdueix un sol caràcter:");


        String cadena = readString(clientName);


        boolean siNo = readYesNo("Vols continuar?");


}