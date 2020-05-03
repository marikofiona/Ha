package datastructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyMap {
	
	public static void main(String[] args) {
		HashMap <String, Integer> books = new HashMap<>();
		books.put("was man von hier aus sehen kann", 2);
		books.put("Blook Sweat and Pixel von Jason Schreier", 10);
		books.put("The Witcher", 1);
		books.put("Harry Potter", 100);
		books.put("Necronomicon", 21);
		books.put("Tokyo Ghoul", 42);
		books.put("Java ist eine Insel", 101);
		
		//101 ausgeben lassen
		System.out.println(books.get("Java ist eine Insel"));
		books.put("Java ist eine Insel", books.get("Java ist eine Insel") + 1);
		
		
		//Set Datenstruktur =
		Set<String> bookname = books.keySet();
		//mit der for each schleife über die Set Datenstruktur iteriren
		//und die buchnamen ausgeben, weil man auf die Keys zugreifen kann
		//wenn man auf die Keys zugreifen kann, dann auch auf die Values
		for(String name : bookname) {
			System.out.println(name + " : " + books.get(name));
		}
		
	}
}