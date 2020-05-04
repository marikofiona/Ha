package AufgabeDatenstruktur;


import java.util.HashMap;

public class Einkaufsliste {
	public static void main(String[] args) {
		
	

	 HashMap<String, String> shopList = new HashMap<>();
	 
	 shopList.put("Abschminktücher", "2");
	 shopList.put("Gesichtsmaske", "2");
	 shopList.put("Shampoo", "1");
	 shopList.put("Bananen", "5");
	 shopList.put("Brot", "1");
	 
	 System.out.println("Einkaufsliste: ");
	 
	 for(String article : shopList.keySet()) {
		 System.out.println(" o " + article);
		 String value = shopList.get(article);
		 System.out.println("   Menge: " + value);
	 }
	 
	 
	 
	}
}