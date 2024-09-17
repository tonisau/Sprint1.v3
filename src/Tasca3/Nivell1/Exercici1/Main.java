package Tasca3.Nivell1.Exercici1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main (String[] args){
        ArrayList<Month> months=createMonthsArray();
        System.out.println("ArrayList sin agosto: \n"+ months + "\n");

        for (int i = 0; i < months.size(); i++) {
            System.out.println(months.get(i).getName());
        }

        months.add(7, new Month("agosto"));
        System.out.println("\n ArrayList con agosto: \n"+ months) ;

        HashSet<Month> monthsSet = createHashSet(months);

        months.forEach(month->System.out.println(month.getName()));


        System.out.println("\n Iterator con agosto: \n"+ months) ;

        Iterator<Month> iterador =months.iterator();
        // Usar el iterador para recorrer la lista
        while (iterador.hasNext()) {
            Month month = iterador.next();
            System.out.println(month.getName());
        }
    }



    private static ArrayList<Month> createMonthsArray() {
        ArrayList<Month> months = new ArrayList<Month>();
        months.add(new Month("enero"));
        months.add(new Month("febrero"));
        months.add(new Month("marzo"));
        months.add(new Month("abril"));
        months.add(new Month("mayo"));
        months.add(new Month("junio"));
        months.add(new Month("julio"));
        months.add(new Month("septiembre"));
        months.add(new Month("octubre"));
        months.add(new Month("noviembre"));
        months.add(new Month("diciembre"));
        return months;
    }

    private static HashSet<Month> createHashSet(ArrayList<Month> months) {
        HashSet<Month> monthsSet = new HashSet<Month>();
        for (Month month : months) {
            monthsSet.add(month);
        }
        return monthsSet;
    }
}
