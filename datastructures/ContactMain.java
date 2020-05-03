package datastructures;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class ContactMain {
	
		
	
	    public static void main(String[]args) throws FileNotFoundException {

	    	Contact person1 = new Contact("Daniel", 198345);
	        Contact person2 = new Contact("Kirsten", 312312);
	        Contact person3 = new Contact("Zorro", 319876);
	        Contact person4 = new Contact("Chuck Norris", 1234567892);
	        Contact person5 = new Contact("Bruce Lee", 345678);
	        Contact person6 = new Contact("Bob Ross", 123345);
	        Contact person7 = new Contact("Uwe Boll", 917283);

	        try {
	            FileOutputStream f = new FileOutputStream(new File("05Vorlesung\\datastructures\\NameUndPunkte.txt"));
	            ObjectOutputStream o = new ObjectOutputStream(f);

	       
	            o.writeObject(person1);
	            o.writeObject(person2);
	            o.writeObject(person3);
	            o.writeObject(person4);
	            o.writeObject(person5);
	            o.writeObject(person6);
	            o.writeObject(person7);

	            o.close();
	            f.close();

	            FileInputStream file = new FileInputStream(new File("05Vorlesung\\datastructures\\NameUndPunkte.txt"));
	            ObjectInputStream object = new ObjectInputStream(file);

	        
	            Contact pr1 = (Contact) object.readObject();
	            Contact pr2 = (Contact) object.readObject();
	            Contact pr3 = (Contact) object.readObject();
	            Contact pr4 = (Contact) object.readObject();
	            Contact pr5 = (Contact) object.readObject();
	            Contact pr6 = (Contact) object.readObject();
	            Contact pr7 = (Contact) object.readObject();

	            System.out.println(pr1.toString());
	            System.out.println(pr2.toString());
	            System.out.println(pr3.toString());
	            System.out.println(pr4.toString());
	            System.out.println(pr5.toString());
	            System.out.println(pr6.toString());
	            System.out.println(pr7.toString());

	            object.close();
	            file.close();
	            

	        } catch (FileNotFoundException e) {
	            System.out.println("Datei nicht gefunden");
	        } catch (IOException e) {
	            System.out.println("Error Initialisierung Stream");
	        } catch (ClassNotFoundException e) {
	           //TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
	        //Abfrage mit instanceOf
	        
	        if (person1 instanceof Contact){
	        	Contact p = (Contact) person1;
	        	System.out.println("\ntrue");
	        }
	        
	        System.out.println(person2 instanceof Contact);
	        System.out.println(person3 instanceof Contact);
	        System.out.println(person4 instanceof Contact);
	        System.out.println(person5 instanceof Contact);
	        System.out.println(person6 instanceof Contact);
	        System.out.println(person7 instanceof Contact);
	     
			//Casten 
	        
	        Contact pr1 = (Contact) person1;
	        Contact pr2 = (Contact) person2;
	        Contact pr3 = (Contact) person3;
	        Contact pr4 = (Contact) person4;
	        Contact pr5 = (Contact) person5;
	        Contact pr6 = (Contact) person6;
	        Contact pr7 = (Contact) person7;
	        
	      
	        
	        
	        //2.) Aufgabe
	        //Mit Hilfe des PrintWriters Text in eine Datei schreiben + mit Scanner lesen
	        
	        File file = new File("05Vorlesung\\datastructures\\Hausi.txt"); 
			if(file.exists()) {				   
				System.out.println("\nDie Datei existiert\n");
			} else {
				System.out.println("\nDie Datei wird angelegt"); 											
				try {                                         
					file.createNewFile();
				} catch (IOException e) {  				
					// TODO Auto-generated catch block  
					e.printStackTrace();
				}
					
			}
			
			try {
				
				FileWriter out = new FileWriter(file);
				PrintWriter writer = new PrintWriter(out);
				writer.println("Hier eine kurze Liste meiner Lieblingsserien und Filme: "
						+ "\n\nMandalorian"
						+ "\nPrison Break"
						+ "\nBrooklyn 99"
						+ "\nStar Wars"
						+ "\nGhibli Filme"
						+ "\n\nViel Spass beim gucken! ;D");
				writer.close();
				out.close();
				
			} catch (IOException e) {
				
			}
		    
			//Mit Scanner auslesen
			File text = new File("05Vorlesung\\datastructures\\Hausi.txt");
		        Scanner scanner = new Scanner(file);
		      
		        
		        int lineNumber = 1;
		        while(scanner.hasNextLine()){
		            String line = scanner.nextLine();
		            System.out.println(line);
		            lineNumber++;
		      
	    
		        }
		        
	    
	    }
	
}
		

	

	
			
		
