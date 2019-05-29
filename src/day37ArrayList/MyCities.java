package day37ArrayList;
import java.util.*;
public class MyCities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList<String> city=new ArrayList<>();
		
		city.add("Istanbul");
		city.add("Izmir");
		city.add("Ankara");
		city.add("NewYork");
		city.add("Tashkent");
		city.add("Istanbul");
		//print each city seperated by space
		for(String cities: city) {
			System.out.print(cities+" ");
		}		
		System.out.println();
		//print each city using for loop
		
		for(int i=0;i<city.size();i++) {
			System.out.print(city.get(i)+" ");
		}
		System.out.println();
		//remove baku
		System.out.println("remove Istanbul ");
		city.remove("Istanbul");
		city.remove("Baku");
		System.out.println(city.toString());
		
		
		
		//isEmpty
		System.out.println("Is list empty: "+city.isEmpty());
		city.add("Bishkek");
		System.out.println(city.toString());
		
		city.add(1, "Istanbul");
		System.out.println(city.toString());
		
		city.set(5, "Seul");
		System.out.println(city.toString());
		
		//find Ankara in the list and give the index
		int idx=city.indexOf("Ankara");
		System.out.println("Ankara index: "+idx);
		city.set(idx, "Baku");
		System.out.println(city.toString());
		
		
		
		city.clear();
		
		boolean empty=city.isEmpty();
		
		System.out.println("empty: "+empty);
		
		
		
		
		
		
		
		
	}

	
		

		
	
}
