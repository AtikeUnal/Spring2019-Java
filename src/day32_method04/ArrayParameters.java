package day32_method04;

import java.util.*;

public class ArrayParameters {

	public static void main(String[] args) {

		int[] myArray = { 44, 55, 66, 11 };
		printArray(myArray);
		printArray(new int[] { 22, 44, 66, 88 });
		printArray(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 });
		int[] one = new int[] { 45, 5, 23, 1, 67 };
		int[] two = new int[] { 5, 7, 2 };
		print2Arrays(one, two);
		print2ArraysV2(one, two);

	}

	public static void printArray(int[] nums) {
		for (int n : nums) {
			System.out.print(n + " ");
		}
		System.out.println();

	}

	public static void print2Arrays(int[] arr1, int[] arr2) {

		if (arr1.length < arr2.length) {

			System.out.println(Arrays.toString(arr2));
		} else if (arr1.length > arr2.length) {

			System.out.println(Arrays.toString(arr1));
		} else {

			System.out.println("They are equal");
		}
	}

	public static void print2ArraysV2(int[] arr1, int[] arr2) {

		if (arr1.length < arr2.length) {
			printArray(arr2);
			printArray(arr1);

		} else if (arr1.length > arr2.length) {
			printArray(arr1);
			printArray(arr2);
		} else {
			printArray(arr1);
		}
	}
}
