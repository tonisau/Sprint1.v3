package Tasca6.Nivell2ENG.n2exercici2;

import Tasca6.Nivell2ENG.n2exercici2.GenericMethods;
public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona("Toni", "Sau", 28);
        Persona persona2 = new Persona("Marina", "Rodriguez", 28);
        Persona persona3 = new Persona("Pedro", "Londres", 28);

        String nombre = "Carla";
        String apellido = "Martinez";
        int edad = 456;

        GenericMethods.GenericMethod(persona, nombre, edad);
        System.out.println("\n");
        GenericMethods.GenericMethod(nombre, apellido, persona2);
        System.out.println("\n");
        GenericMethods.GenericMethod(persona3, edad, persona);
    }
}
