package day65_Collections02;

import java.util.*;

public class LoopArraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		List<Integer> nums= new ArrayList<>();
		nums.add(50);nums.add(501);nums.add(502);nums.add(503);nums.add(503);
		nums.add(504);nums.add(505);nums.add(505);nums.add(505);nums.add(506);
		
		
		//for each loop
		for (int n : nums) {
			System.out.print(n+" | ");
		}
		System.out.println();
		
		
		//loop using regular for loop
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i)+" | ");
		}
		System.out.println();
		
		
		
		//for each method of java 8
		
		//lambda expression is part of java functional programing that started from java 8
		//it is used to pass an implementation while programming.  we use -> operator
		//for each method comes from Iterable interface and need to pass a lambda expresssion
		nums.forEach(n -> System.out.print(n+" | "));
		
		System.out.println();
		
		 nums.removeIf(n -> n < 500);
		
		 nums.forEach(n -> System.out.print(n+" | "));
		
		 
		
	}

	
	
}
