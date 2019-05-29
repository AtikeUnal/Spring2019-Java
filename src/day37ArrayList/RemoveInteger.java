package day37ArrayList;

import java.util.ArrayList;

public class RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> nums = new ArrayList<>();
		System.out.println(nums.size());

		System.out.println(nums.isEmpty());

		System.out.println(nums.size() == 0);

		nums.add(4);
		nums.add(334);
		nums.add(42);
		nums.add(46);
		nums.add(48);
		nums.add(14);
		nums.add(49);

		
		System.out.println(nums.toString());
		
		nums.remove(4);
		System.out.println(nums.toString());
		Integer n1=new Integer(4);
		Integer n2= Integer.valueOf(4);
		nums.remove("4"); //it doesnt work
		System.out.println(nums.toString());
		nums.remove(n2);
		System.out.println(nums.toString());
		
		
		
		
	}

}
