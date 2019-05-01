package day35_practice;

import java.util.*;

public class PrintUniqueNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1) in main method
//		2) void method that accepts an array
//	3) method that accepts int[] and returns int[] with unique values

		int[] nums = { 1, 2, 4, 2, 4, 5, 6, 7, 7, 8, 8 };

		getUnique(nums);
		
		int arr[]	= {4,8,6,3,4,3,};
		getUnique(nums);
		
		int[] unique = getUniqueArray(arr);
		System.out.println(Arrays.toString(unique));
//		int []unique= getUniqueArray(arr);
//		System.out.println(Arrays.toString(unique));
		
		int[] cheapUnique = getUniqueCheapV2(arr);
		System.out.println(Arrays.toString(cheapUnique));
		
				}

	public static void getUnique(int[] nums) {
		for (int i = 0; i < nums.length; i++) { //outer loop
			int count = 0;
			int temp = nums[i];
			for (int j = 0; j < nums.length; j++) {

				if (nums[j] == temp && i != j) {
					count++;
					break;
				}

			}
			if (count == 0) {
				System.out.println(temp);
			}
		}
	}

	//find out how many unique numbers
	//declare new array with that size
// loop through again and assign and unique numbers
	//return the array
	public static int[] getUniqueArray(int[] nums) {
			int uniquecount=0;
		for (int i = 0; i < nums.length; i++) { //outer loop
			int count = 0;
			int temp = nums[i];
			for (int j = 0; j < nums.length; j++) {

				if (nums[j] == temp && i != j) {
					count++;
					break;
				}

			}
			if (count == 0) {
				uniquecount++;
				
			}
		}
			int []uniqueArray=new int[uniquecount];
		
			int idx=0;	
			for (int i = 0; i < nums.length; i++) { //outer loop
				int count = 0;
				int temp = nums[i];
				for (int j = 0; j < nums.length; j++) {

					if (nums[j] == temp && i != j) {
						count++;
						break;
					}

				}
				if (count == 0) {
					uniqueArray[idx]=temp;
					idx++;
					
				}
			}
		return uniqueArray;	
	}




public static int[]getUniqueCheapV2(int[]nums){
	
	String str="";
	
	for (int i = 0; i < nums.length; i++) { //outer loop
		int count = 0;
		int temp = nums[i];
		for (int j = 0; j < nums.length; j++) {

			if (nums[j] == temp && i != j) {
				count++;
				break;
			}

		}
		if (count == 0) {
			str+=temp+" ";
		}
		
	}
	
	
	String[] strArr=str.trim().split(" ");
	
	int[]strToInt=new int[strArr.length];
	
	for(int k=0;k<strArr.length;k++) {
		strToInt[k]=Integer.parseInt(strArr[k]);
	}
	
	
	return strToInt;
	
	
	
	
}
}