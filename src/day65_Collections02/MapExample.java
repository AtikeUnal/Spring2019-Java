package day65_Collections02;

import java.util.*;

public class MapExample {
	public static void main(String[] args) {

		Map<String, Double> items = new HashMap<>();
//key is unique but you can update the value

		items.put("Apples", 3.99);
		items.put("Flowers", 12.99);
		items.put("Eggs", 4.99);
		items.put("Cherries", 6.99);
		items.put("Milk", 6.0);
		items.put("Milk", 5.00);

		System.out.println(items.size());

		System.out.println(items.get("Flowers"));

		System.out.println(items.toString());

		items.isEmpty();
		System.out.println(items.isEmpty());

		items.remove("Milk");
		System.out.println(items.toString());

		System.out.println("Is apple there? " + items.containsKey("Apples"));

		System.out.println("Is Flowers there? "+items.containsKey("Flowers"));
		
		
		items.replace("Eggs", 2.99);
		System.out.println(items.toString());
		
		items.replace("Milk", 3.99);
		
		System.out.println(items.get("Eggs"));
		System.out.println(items.toString());
		
		items.replace("Cherries", items.get("Cherries")+2);
		
		
		
		
		
		
		
		
		

	}

}
