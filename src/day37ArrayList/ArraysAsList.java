package day37ArrayList;

import java.util.*;

public class ArraysAsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> cars = Arrays.asList("Tesla", "Porsche", "Honda");

		List<Integer> nums = Arrays.asList(1, 3, 4, 5, 6);
		System.out.println(nums.size());
		System.out.println(nums.toString());

//		nums.add(100);
//		System.out.println(nums.toString()); it is not re-sizable

		// create arraylist prices
		// assign values using Arrays.aslist

		List<Double> dnums = Arrays.asList(1.99, 10.99, 100.3, 43.75, 99.0, 123.80, 69.90, 1000.5, 4.7, 3.8);

		System.out.println(dnums);

		// calculate the sum

		double sum = 0;

		for (Double price : dnums) {
			sum += price;
		}
		System.out.println(sum);

		double sum2 = 0;

		for (int i = 0; i < dnums.size(); i++) {
			sum2 += dnums.get(i);
		}
		System.out.println(sum2);

	
	List <Double> expensive =new ArrayList<>();
	
	for(double price : dnums) {
	if(price >100.0) {
	expensive.add(price);
	}}
	System.out.println(expensive);
	//remove all expensive prices from dnums
	dnums.removeAll(expensive);
	//System.out.println(dnums.toString());
}}
