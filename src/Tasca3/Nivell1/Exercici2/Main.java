package Tasca3.Nivell1.Exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
            // Crear y llenar la primera lista
            List<Integer> lista1 = new ArrayList<>();
            lista1.add(1);
            lista1.add(2);
            lista1.add(3);
            lista1.add(4);
            lista1.add(5);

            // Crear la segunda lista
            List<Integer> lista2 = new ArrayList<>();

            // Usar ListIterator para recorrer la primera lista en orden inverso
            ListIterator<Integer> listIterator = lista1.listIterator(lista1.size());

            while (listIterator.hasPrevious()) {
                lista2.add(listIterator.previous());
            }

            // Imprimir ambas listas para verificar los resultados
            System.out.println("Primera lista: " + lista1);
            System.out.println("Segunda lista (orden invers): " + lista2);
        }
    }

