package day64_Collections01;

import java.util.*;

public class ArrayVsArrayList {

	public static void main(String[] args) {
		int[] numsArray = { 30, 4, 5478 };
		// Arrays are fix size
		// Allows duplicates
		// Keeps ordering
		// Allows primitives and objects

		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";

		// Arraylist

		List<Integer> numsList = new ArrayList<>();

		numsList.add(44);
		numsList.add(44);
		numsList.add(101);

		System.out.println(numsArray[0]);
		System.out.println(numsList.get(0));
		
		
		
		System.out.println(Arrays.toString(numsArray));
		System.out.println(numsList.toString());
		
		

	}

}
