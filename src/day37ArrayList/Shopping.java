package day37ArrayList;

import java.util.ArrayList;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String>shopping=new ArrayList<>();
		
		shopping.add("shoes");
		shopping.add("car");
		shopping.add("notebook");
		shopping.add("lemon");
		shopping.add("scarf");
		shopping.add("toy");
		
		int count=shopping.size();
		System.out.println("Total: "+count);
		
		System.out.println(shopping.toString());
	
		System.out.println(shopping.get(0)+" ~ "+shopping.get(count-1));
		shopping.remove(0);
		
		System.out.println(shopping.toString());
		
		shopping.remove("car");
		
		System.out.println(shopping.toString());
		
		
		
		
		for(String item :shopping) {
			
			System.out.println(item);
			
		}	
			//remove all items at once
			
		
		
			shopping.clear();
			System.out.println(shopping.toString());
		
		
		
		
		
		
		
		
	}

}
