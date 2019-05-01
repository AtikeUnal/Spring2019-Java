package day34_method06;
import java.util.*;
public class CountArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int nums[]= {2,3,4,5,5,6,6,6,7,8,5,5,5,12};
		System.out.println(findOccurences(nums,5));		
System.out.println(findOccurences(nums,6));
		int fives=findOccurences(nums,5);
		
		if(fives>0) {
			System.out.println("We have 5's");
		}else {
			System.out.println("No 5's");
		}
		
		
		if(findOccurences(nums,2)>0) {
			System.out.println("We have 2's");
		}else {
			System.out.println("No 2's");
		}
		
	}
	
	
	
	
	
	
	
public static int findOccurences(int[]array, int value) {
	 
	
	int count=0;
for(int arr:array) {		
		if(arr==value) {
		count++;
	}}
	return count;
}



public static int[] getArray() {
	
	int rArray[]= {2,4,5,6,6,7,8};
	
	return  rArray;
	
}


public static int[]getRandomArray(int size){
	
	Random random=new Random();
	int arr[]=new int[size];
	for(int i=0;i<size;i++) {
	arr[i]=random.nextInt(101);
	}	
	return arr;
}





}
