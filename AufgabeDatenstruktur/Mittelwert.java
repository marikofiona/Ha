package AufgabeDatenstruktur;

import java.util.*;

public class Mittelwert {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		LinkedList<Double> list = new LinkedList<>();

		System.out.println("Zahl für den Mittelwert, Abbruch mit \"quit\": ");
		String number = scanner.next();
		Double wert = 0.0;
		int counter = 0;

		try {
			while (!number.equals("quit")) {
				list.add(Double.parseDouble(number));
				System.out.println("Zahl für den Mittelwert, Abbruch mit \"quit\": ");
				number = scanner.next();
			}
			if (number.equals("quit")) {
				Iterator<Double> iterator = list.iterator();
				while (iterator.hasNext()) {
					counter += 1;
					wert += iterator.next();
				}
				System.out.println("Mittelwert: " + wert / counter);
			}
		} catch (NumberFormatException fehler) {
			System.out.println("Ungültige Eingabe.Zahl für den Mittelwert, Abbruch mit \"quit\": ");
			number = scanner.next();
		}
		scanner.close();
	}

}
