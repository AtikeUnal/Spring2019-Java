package day27_Arrays05;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		int []nums= {1,9,19,29,39,79,100};
		
		System.out.println(Arrays.binarySearch(nums, 39));
		System.out.println(Arrays.binarySearch(nums, 100));
		System.out.println(Arrays.binarySearch(nums, 9));
		int idx=Arrays.binarySearch(nums, 19);
		System.out.println(idx);
		
		
		int []nums2= {21321,9,149,289,939,79,100};
		Arrays.sort(nums2);
		System.out.println(Arrays.toString(nums2));
		System.out.println(Arrays.binarySearch(nums2, 100));
		
	}

}
