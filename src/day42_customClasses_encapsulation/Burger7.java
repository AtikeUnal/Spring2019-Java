package day42_customClasses_encapsulation;

import java.util.*;

public class Burger7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Burger burger1 = new Burger();
		burger1.name = "COWBOY";

		String[] ings = { "onion crisps", "american cheese", "pickles", "lettuce", "b7 sauce" };

		burger1.arrayIng = ings;

		System.out.println(burger1.name);
		System.out.println(Arrays.toString(burger1.arrayIng));
		//first object of array
		System.out.println(burger1.arrayIng[0]);
		
		
		for(String br: burger1.arrayIng) {
			System.out.println(br);
		}
	}

}
