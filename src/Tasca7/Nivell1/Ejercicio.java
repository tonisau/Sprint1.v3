package Tasca7.Nivell1;

public class Ejercicio {
    public static void main(String[] args){
        Treballador TreballadorNormal = new Treballador("Luis", "Perez", 9);
        TreballadorOnline TreballadorOnline = new TreballadorOnline("Ana", "Rodriguez", 9);
        TreballadorPresencial TreballadorEnPersona = new TreballadorPresencial("Jamie", "Adams", 9);

        System.out.println("Salario de un Treballador: " + TreballadorNormal.calcularSou(160));
        System.out.println("Salario de un TreballadorOnline: " + TreballadorOnline.calcularSou(160));
        //System.out.println("Salario de un TreballadorPresencial: " + TreballadorPresencial.calcularSou(160));


    }
}
