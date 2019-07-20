package day64_Collections01;

import java.util.*;

public class LinkedListexample {

	
	public static void main(String[] args) {
		List <Integer>list= new LinkedList<>();
		LinkedList <Integer>list2= new LinkedList<>();
		
		list.add(1);
		list.add(400);
		list.add(2988);
		System.out.println(list.get(2));
		
		list.contains(400);
		
		
		list2.add(40);
		list2.add(560);
		list2.add(4324);
		list2.add(22);
		System.out.println(list2.getFirst());
		list2.addFirst(1);
		System.out.println(list2.toString());
	}
}
