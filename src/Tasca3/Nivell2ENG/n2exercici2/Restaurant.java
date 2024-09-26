package Tasca3.Nivell2ENG.n2exercici2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>{
	private String name;
	private int score;

	public Restaurant(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}

	@Override
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

	@Override
	public String toString() {
		return "Restaurante: " + name + ", puntuación: " + score;
	}

	@Override
	public int compareTo(Restaurant other) {
		int comparison = this.getName().compareTo(other.getName());
		if (comparison != 0) {
			return comparison;
		}
		Integer thisScore = this.getScore();
		Integer otherScore = other.getScore();
		comparison = thisScore.compareTo(otherScore);
		return comparison;
	}
}
