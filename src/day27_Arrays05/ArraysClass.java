package day27_Arrays05;

import java.util.*;

public class ArraysClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 43, 12, 4, 1, 3, 5 };

		String str = Arrays.toString(nums);
		System.out.println(str);
		
		//sort method in ascending order
		Arrays.sort(nums);
		System.out.println(Arrays.toString(nums));
		
		
		 String[] languages = {"Zulu", "Spanish", "Italian", "English", "1Polish", "arabic","Uzbek"};

		System.out.println(Arrays.toString(languages));
		Arrays.sort(languages);
		System.out.println(Arrays.toString(languages));
		
		
		
		
		int nums2[]= {0,2,1,8,100000,5,27};
		System.out.println(Arrays.toString(nums2));

		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		int lowest=nums2[0];
		int largest=nums2[nums2.length-1];
		System.out.println(lowest+ " is lowest number");
		System.out.println(largest+" is largest number");
		
		
		
	
		
	}

}
