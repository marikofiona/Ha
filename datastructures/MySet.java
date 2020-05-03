package datastructures;

import java.util.HashSet;
import java.util.Iterator;
public class MySet {

	public static void main(String[] args) {
		HashSet<String> names = new HashSet<>(); // () Kontruktorklammern
												 // <> nicht noch ein zweites mal string weil schon am anfang
		
		names.add("Wolvernine");
		names.add("Pika");
		names.add("Tim Apple");
		names.add("Diggibiggi");
		names.add("joe Mama");
		
		
		//String Datentyp
		//durch datenstrukute gehen und elemente ausgeben dann exception
/*		for(String name : names) {
			System.out.println(name);
			if(name.equals("Pika")) {
				names.remove(name);
				
			}
		} */
		
		
		//Iterator wenn:
		//gute Methode bei durchiterieren der Datenstrukturen fürs einfügen & entfernen
		//also: modifizierung der Datenstruktur!!
		
		Iterator<String> iterator = names.iterator();
		while(iterator.hasNext()) { //solange es ein nächstes Element gibt ausgeben lassen(mit iterator.next)
			String name = iterator.next();
			System.out.println(name);
			if(name.contentEquals("Pika")) { //wenn der name pika ist, dan enfernen
				iterator.remove();
			}
			
		}
		System.out.println(names.size());
		
	}
}
