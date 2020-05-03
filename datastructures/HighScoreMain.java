package datastructures;

import java.util.ArrayList;
import java.util.Collections;

public class HighScoreMain {

	public static void main(String[] args) {
		
		//Spitze Klammern das Objekt was man einspeichern will
		ArrayList<HighScore> highscore = new ArrayList<>();
		highscore.add(new HighScore("Pika", 43));
		//erstes Argument username, zweites Argument Punkte
		highscore.add(new HighScore("Chuck", 10000));
		highscore.add(new HighScore("Vegeta", 9001));
		highscore.add(new HighScore("Edmund W", 42));
		highscore.add(new HighScore("Covid", 19));
		highscore.add(new HighScore("Covid", 1337));
		
		//Mit "sort" Elemente sortieren
		Collections.sort(highscore);	
		
		for(HighScore score : highscore) {
			System.out.println(String.format("%10s:\t%d", score.getName(), score.getPoints()));
		} //%s = %String, \t = tabulator, %d = integer 10= wie viele zeichen
	}
	
}



		