package Tasca3.Nivell1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main (String[] args){
        ArrayList<Month> months=createMonthsArray();
        System.out.println("ArrayList sin agosto: \n"+ months + "\n");

        months.add(7, new Month("agosto"));
        System.out.println("ArrayList con agosto: \n"+ months) ;

        HashSet<Month> monthsSet = createHashSet(months);

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
