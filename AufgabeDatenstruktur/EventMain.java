package AufgabeDatenstruktur;


import java.util.ArrayList;

public class EventMain {

	public static void main(String[] args) {

		ArrayList<Event> events = new ArrayList<>();

		events.add(new Event("Sport", "Zuhause", "Heute"));
		events.add(new Event("Papas Geburtstag", "Eidelstedt", "19.04.2020"));
		events.add(new Event("Verabredung mit Lea", "Hoheluftbrücke", "23.05.2020"));
		events.add(new Event("Essen gehen", "Sakura Sushi", "06.07.2020"));
		events.add(new Event("Programmieren2 Prüfung", "Uni-Finkenau", "07.07.2020"));
		
		

		System.out.printf("%-35s | %-35s | %-25s\n", "Event", "Ort", "Datum");
		for (Event event : events) {
			
			System.out.printf("%-35s | %-35s | %-25s\n", event.getName(), event.getOrt(), event.getDatum());
		}

	}
}