package Tasca3.Nivell2.Exercici1;

import java.util.Objects;

public class Restaurant {

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

    // Sobrescribir toString para facilitar la impresión del objeto
    @Override
    public String toString() {
        return "Restaurant{" +
                "nom='" + name + '\'' +
                ", puntuació=" + score +
                '}';
    }
}
