package day39_ArrayList04;

import java.util.*;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> cities = new ArrayList<>();

		cities.add("Tokyo");
		cities.add("New York");
		cities.add(0, "Paris");
		cities.add("Pittsburgh");
		cities.add(1, "Berlin");
		cities.add("Madrid");
		cities.add("Moscow");
		cities.add("Istanbul");
		cities.add("Washington D.C.");
		cities.add("Amsterdam");
		cities.add("Zurich");
		cities.add("Singapore");
		cities.add("Milan");
		cities.add("Toronto");
		cities.add("London");
		cities.add("Lima");
		
		for(String each:cities) {
		System.out.print(each+" | ");
		}
		System.out.println();
		
	for(int i=0; i<cities.size();i++) {
			System.out.print(cities.get(i)+" | ");
	}
		
		System.out.println();
		System.out.println(cities.toString().toUpperCase());
		
		
		
		for(int i=0;i<cities.size();i++) {
		String upper=cities.get(i);
			cities.set(i, cities.get(i).toUpperCase());
			
		}
		System.out.print(cities);
		System.out.println();
		//find the longest and shortest array
		String longest="";
		String shortest="";
		
	
		for(String each:cities) {
			if(each.length()>longest.length()) {
				longest=each;
			}
		}
		System.out.println(longest);
		
		
		
			shortest=cities.get(0);
			
			for(String each1:cities) {
				if(each1.length()<shortest.length()) {
					shortest=each1;
				}
			
		}
		
		System.out.println(shortest);
		
		
		
		
		
		List <String > citiesMoreThan6= new ArrayList<>();
		
		//assign all cities that have more than 6 chars
		
		
		
		
		for(String six:cities) {
			if(six.length()>6) {
				citiesMoreThan6.add(six);	
			}
		}
		System.out.println(citiesMoreThan6);
	}

}
