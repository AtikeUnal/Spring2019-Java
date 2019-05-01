package day27_Arrays05;
import java.util.*;
public class CopyOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[]nums1= {34,56,23,1,55};
		
		int []nums2=Arrays.copyOf(nums1, nums1.length+2);
		
		System.out.println(Arrays.toString(nums1));
		
		System.out.println(Arrays.toString(nums2));
		
		int []nums3=Arrays.copyOfRange(nums1, 1, 4);
		System.out.println(Arrays.toString(nums3));
		
		
		
		
		int[]brandNew= {21,32,43,54};
		System.out.println(brandNew.length);
		brandNew=Arrays.copyOf(brandNew, brandNew.length+5);
		System.out.println(brandNew.length);
		
	}

}
