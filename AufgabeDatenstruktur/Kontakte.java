package AufgabeDatenstruktur;

import datastructures.HighScore;

public class Kontakte implements Comparable<Kontakte> {

	private String name;
	private int number;

	// ALT SHIFT S für getter und setter
	// Formatierung: STRG SHIFT S
	public Kontakte(String name, int number) {
		super();
		this.name = name;
		this.number = number;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	
	
	
	public int compareTo(Kontakte other) {
		if (this.number > other.number) {
			return -1;
		} else if (this.number < other.number) {
			return 1;
		}
		return name.compareTo(other.name);
	}

}