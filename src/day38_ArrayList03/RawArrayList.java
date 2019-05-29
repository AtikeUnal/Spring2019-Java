package day38_ArrayList03;

import java.util.*;

public class RawArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList list = new ArrayList();

		list.add("Saturday");
		list.add("Java day");
		list.add(32);
		list.add(234.5);
		list.add(true);
		System.out.println(list); //list.toString 

		String allValues = list.toString();

		System.out.println(allValues);
		
		list.get(0);
		
		Integer i= (Integer) list.get(2);  //downcasting
		System.out.println(i);
		//all values are stored as a raw type .we can also call it as a general object type
	}

}
