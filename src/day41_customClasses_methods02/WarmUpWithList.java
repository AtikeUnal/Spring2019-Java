package day41_customClasses_methods02;
import java.util.*;
public class WarmUpWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr=new ArrayList<>();
		
		arr.add(5);
		arr.add(10);
		arr.add(2);
		arr.add(4);
		System.out.println(doubleTheList(arr));
		
		
		List<Integer> myList2 = new ArrayList<>();
		myList2.add(50);
		myList2.add(44);
		myList2.add(101);
		List<Integer> newList = doubleTheList(myList2);
		System.out.println(newList);
	}
public static List<Integer> doubleTheList(List<Integer> nums){
	
	
	for(int i=0;i<nums.size();i++) {
		nums.set(i, nums.get(i)*2);
	}
	
	
	return nums;
}
}
