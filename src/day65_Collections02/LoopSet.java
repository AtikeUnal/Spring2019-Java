package day65_Collections02;

import java.util.*;

public class LoopSet {
public static void main(String[] args) {
	Set <Integer>numsSet=new TreeSet<>();
	//if you want to sorted use TreeSet instead of HashSet
	//Set <Integer>numsSet2=new TreeSet<>(Comparator.reverseOrder());
	//to reverse in order
	
	numsSet.add(10);numsSet.add(101);numsSet.add(102);numsSet.add(102);numsSet.add(130);numsSet.add(410);numsSet.add(106);
	
	System.out.println(numsSet.size());
	
	System.out.println(numsSet.toString());
	
	
	for (int integer : numsSet) {
		System.out.print(integer+" ");
	}
	System.out.println();
	
	//for each method with lambda
	numsSet.forEach(n-> System.out.print(n+" "));
	System.out.println();
	
	
	
	
}
}
