package day38_ArrayList03;

import java.util.*;

public class MethodSummary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list1 = new ArrayList<>();

		list1.add("red");
		list1.add("blue");
		list1.add("white");
		list1.add("gray");
		list1.add("black");

		list1.add(0, "yellow");
		System.out.println(list1.toString());

		System.out.println("Number of elements: " + list1.size());

		// get methods return value from index 3
		System.out.println("3: " + list1.get(3));

		// removes value using index
		list1.remove(0);
		System.out.println(list1.toString());

		// remove using value/element.
		list1.remove("blue");

		System.out.println(list1);

		// set (index ,value) replace certain index with new value

		list1.set(0, "orange"); // it replace

		// indexOf (value) returns index of value i the list

		System.out.println(list1.indexOf("gray"));
		// isEmpty() returns if it is empty
		System.out.println("is list Empty " + list1.isEmpty());

		// contains()==>returna true if value is present
		System.out.println("White is in the list" + list1.contains("white"));

		List<String> list2 = new ArrayList<>();
		// addAll
		list2.addAll(list1);
		System.out.println(list1);
		System.out.println("list2: "+list2.toString());
		System.out.println("Contains All:"+ list1.containsAll(list2));
		
		//equals (list) checks if 2 lists are exactly equal
		
		System.out.println("equals "+ list1.equals(list2));
		//
		
		list2.add("pink");
		
		list2.removeAll(list1);
		System.out.println(list2);
		System.out.println(list1);
		
		
		//addAll (index, list) adds a new list values starting from given index
		list2.addAll(0,list1);
		System.out.println("list2 after list2.addAll(0, list1): "+list2);
		//
		//list1.clear();
		//list2.clear();
		System.out.println("both empty? -" + (list1.isEmpty() && list2.isEmpty()));
		System.out.println(combineAL(list1, list2));
	}
	
		public static List<String> combineAL(List<String> list1, List<String> list2) {
		
		
		
		List<String> newArr=new ArrayList<>();
		newArr.addAll(list1);
		newArr.addAll(list2);
		return newArr;
		
	}
	}


