package day38_ArrayList03;
import java.util.*;
public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer>list1= new ArrayList<>();
		
		list1.add(30);
		list1.add(12);
		list1.add(22);
		
		
		List<Integer> list2 =new ArrayList<>();
		
		list2.add(345);
		list2.add(30);
		list2.add(12);
		list2.add(120);
		list2.add(30);
		
		
		
		
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		list2.removeAll(list1);
		System.out.println(list2);
		
		
		list2.addAll(list1);
		System.out.println(list2);
		
		
		
		
		
		
	}

}
