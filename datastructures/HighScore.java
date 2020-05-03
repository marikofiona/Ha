package datastructures;


// Comparable zum vergleichen von Objekten
public class HighScore implements Comparable<HighScore> {

	private String name;
	private int points;
	

// Formatieren: STRG - shit - f
// Konstruktornamen
	
// ALT- shift - s für z.b  getter und setter
	
// Kontruktor mit namen und punkten
// Klasse HighScore ist das this.Objekt und das andere Objekt other :)
	
	public HighScore(String name, int points) {
		super();
		this.name = name;
		this.points = points;

	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}

	
	@Override 
	// CompareTo Methode
	
	//HIER: sind die Punkte aus dem This objekt größer als das des anderen ? 
	public int compareTo(HighScore other) {
		if (this.points > other.points) {
			return -1;
		} else if (this.points < other.points) {
			return 1;
		}
		return name.compareTo(other.name);
		
// other ist ein anderes Objekt, kann auf die Points zugreifen
// warum von points auf others zugreifen ? weil die selbe Klasse
	}

}
