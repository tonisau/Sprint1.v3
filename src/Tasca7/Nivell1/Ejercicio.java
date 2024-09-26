package Tasca7.Nivell1;

public class Ejercicio {
    public static void main(String[] args){
        Treballador TreballadorNormal = new Treballador("Pedro", "Santos", 9);
        TreballadorOnline TreballadorOnline = new TreballadorOnline("Marina", "Rodriguez", 9);
        TreballadorPresencial TreballadorEnPersona = new TreballadorPresencial("Jaume", "Parodi", 9);

        System.out.println("Salario de un Treballador: " + TreballadorNormal.calcularSou(160));
        System.out.println("Salario de un TreballadorOnline: " + TreballadorOnline.calcularSou(160));
        //System.out.println("Salario de un TreballadorPresencial: " + TreballadorPresencial.calcularSou(160));


    }
}
