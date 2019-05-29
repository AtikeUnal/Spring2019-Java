package day39_ArrayList04;

import java.util.*;

public class PrintList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numsList = new ArrayList<>();

		numsList.add(10);
		numsList.add(10);
		numsList.add(7);
		numsList.add(8);
		numsList.add(8);
		numsList.add(3);
		numsList.add(4);
		numsList.add(8);
		printList(numsList);
		List<Double> numList1 = new ArrayList<>();
		numList1.add(10.33);
		numList1.add(10.22);
		numList1.add(7.34);
		numList1.add(8.99);
		numList1.add(8.12);
		numList1.add(3.55);
		numList1.add(4.76);
		numList1.add(8.8);

		System.out.println(sumList(numList1));

		// getList
		System.out.println(getList(10));
		List<Integer> list = getList(15);
		System.out.println(list);
		//
		System.out.println(getRandomList(10));
		List<Integer>rList=getRandomList(13);
		Collections.sort(rList);
		System.out.println(rList);
		
		List<String> strL = new ArrayList<>();
		strL.add("56");
		strL.add("99");
		strL.add("90");
		strL.add("9");
		List<Integer> converted= convertToIntList(strL);
		System.out.println(converted);
	}

	public static void printList(List<Integer> nums) {

		for (Integer n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

	}
	/*
	 * sumList return type: int param: List<Double> Calculates sum of each double
	 * value and returns the result
	 */

	public static double sumList(List<Double> value) {

		double result = 0.0;

		for (Double d : value) {
			result += d;
		}

		return result;

	}

	public static List<Integer> getList(int size) {

		List<Integer> getArray = new ArrayList<>();

		for (int w = 0; w <= size; w++) {
			getArray.add(w);

		}
		return getArray;

	}

	/*
	 * 
	 * 4) getRandomList return type: List<Integer> params: int size getList(5); =>
	 * 3,55,12,99,34
	 */

	public static List<Integer> getRandomList(int size){
		
	
		
		Random r = new Random(); //object of Random class
		List<Integer> randomNums = new ArrayList<>();
		for(int i = 1; i <= size; i++) {
			randomNums.add(r.nextInt(101));
		}
		return randomNums; 
	}
	
	/*
	 * 5) convertToIntList
   Return type: List<Integer>
   Param: List<String>
   It will take each string and convert to Integer and return as Integer list
   List<String> strL = new ArrayList<>();
   strL.add("56");
   strL.add("99");
   convertToIntList(strL); => [56, 99] 
	 */
	public static List<Integer> convertToIntList(List<String> convert){
		
		List<Integer> Newstr = new ArrayList<>();
		
		for(String str:convert) {
			Newstr.add(Integer.parseInt(str));
		}
//		for(int i=0;i<Newstr.size();i++) {
//			Integer pars=Integer.valueOf(i);
//			Newstr.add(pars);
//		}
		
		return Newstr;
			
	}
}
