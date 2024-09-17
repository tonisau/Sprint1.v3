package Tasca3.Nivell2.Exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{

    private String name;
    private int score;

    public Restaurant(String name, int score){
        this.name=name;
        this.score=score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    // Sobrescribir hashCode y equals para evitar duplicados en HashSet
    public int hashCode() {
        return Objects.hash(name, score);
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Restaurant other = (Restaurant) obj;
        return Objects.equals(name, other.name) && score == other.score;
    }

    // Implementar compareTo para ordenar por nom y puntuació
    public int compareTo(Restaurant other) {
        int nameComparison = this.name.compareTo(other.name);
        if (nameComparison != 0) {
            return nameComparison;
        } else {
            return Integer.compare(other.score, this.score);
        }
    }


    // Sobrescribir toString para facilitar la impresión del objeto
    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + name + '\'' +
                ", puntuació=" + score +
                '}';
    }
}
