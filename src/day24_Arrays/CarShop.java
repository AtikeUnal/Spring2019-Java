package day24_Arrays;

import java.util.Arrays;

public class CarShop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// BMW, Audi, Ford, honda, Mercedes, Mercury, Rolls-Royce, Tesla

		String[] cars = { "BMW", "Audi", "Ford", "Honda", "Mercedes", "Mercury", "Rolls-Royce", "Tesla" };

		// String[]cars2=new String[8];
		// print cars that starts with "M"

		for (String car : cars) {
			if (car.startsWith("M")) {
				System.out.println(car);

//				int i = 0;
//				while (i < cars.length - 1) {
//					System.out.println(i);
//				}
			}
		}

		for(String car: cars) {
			if(car.toLowerCase().contains("r")) {
				System.out.println(car);
			}
		}
		System.out.println("***********");
		for(String ends: cars) {
			if(ends.endsWith("a")) {
				System.out.println(ends);
			}
		}
		System.out.println("**************");
		for(String six:cars) {
			if (six.length()>5) {
				System.out.println(six);
			}
		}
		String temp=cars[0];
		cars[0]=cars[cars.length-1];
		cars[cars.length-1]=temp;
		
			
			System.out.println(Arrays.toString(cars));
			System.out.println("Before sorting");
	        System.out.println(Arrays.toString(cars));
	        Arrays.sort(cars);
	        System.out.println("After sorting");
	        System.out.println(Arrays.toString(cars));
		
	}

}
