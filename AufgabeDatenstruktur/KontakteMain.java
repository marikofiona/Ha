package AufgabeDatenstruktur;
 

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import datastructures.Contact;

public class KontakteMain {


		public static void main(String[] args) {

			ArrayList<Kontakte> kontakte = new ArrayList<>();

			kontakte.add(new Kontakte("Lisa", 156789898));
			kontakte.add(new Kontakte("Kristina", 289297785));
			kontakte.add(new Kontakte("Michael", 324342342));
			kontakte.add(new Kontakte("Jackson", 44343435));
			kontakte.add(new Kontakte("Luis", 67576656));

			
			
		//Mit "sort" Elemente sortieren
		Collections.sort(kontakte);	
		
	for(Kontakte score : kontakte) {
			System.out.println(String.format("%10s:\t%d", score.getName(), score.getNumber()));
		}  //%s = %String, \t = tabulator, %d = integer 10= wie viele Zeichen
	}
	
}
