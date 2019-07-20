package day65_Collections02;

import java.util.*;

public class LoopWithIterator {

	public static void main(String[] args) {

		List<Integer> numsSet = new ArrayList<>();
		numsSet.add(10);
		numsSet.add(101);
		numsSet.add(102);
		numsSet.add(102);
		numsSet.add(130);
		numsSet.add(410);
		numsSet.add(106);

		Iterator<Integer> it = numsSet.iterator();
		// returns true if there is next value
		System.out.println("it.hasNext() : " + it.hasNext());
		// gives current value and moves to next value
		System.out.println("it.next()->: " + it.next());
		System.out.println("it.next()->: " + it.next());

		while (it.hasNext()) {
			System.out.print(it.next() + " | ");
		}
		System.out.println();
		//System.out.println(it.next());    java.util.NoSuchElementException  because it reached to the end
		
		Iterator<Integer> it2 = numsSet.iterator();
		while(it2.hasNext()) {
			int val=it2.next();
			if(val>100) {
				it2.remove();
			}
		}
		System.out.println(numsSet.toString());
		
		
		
		
		
	//	for(int num: numsSet) {
	//		if(num>20) {
		//		numsSet.remove(new Integer(num));
		
		
		
		List<String>cities=new ArrayList<>();
		
		cities.add("New York");
		cities.add("Istanbul");
		cities.add("Boston");
		cities.add("Vienna");
		cities.add("Fairfax");
//		
//		for(String city: cities) {
//			if(city.equals("Boston")) {
//				cities.remove(city);
//			}
//			System.out.println(city);
		
		}
		
		
		
		
		
		
		
		
		
		
			}
	


