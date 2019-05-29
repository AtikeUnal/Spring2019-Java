package day38_ArrayList03;
import java.util.*;
public class CollectionSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List <Integer> numsList =new ArrayList<>();
		numsList.add(44);
		numsList.add(1);
		numsList.add(4);
		numsList.add(4);
		numsList.add(10000);
		numsList.add(3);
		System.out.println(numsList);
		System.out.println("Sorting please wait... ");
		
		Collections.sort(numsList);
		
		System.out.println(numsList);
		
		
		
		
		
		List<String> str=new ArrayList<>();
		
		str.add("Fuad");
		str.add("Roman");
		str.add("Muhabbat");
		str.add("Bojan");
		str.add("Zeynep");
		str.add("Atike");
		System.out.println(str);
		
		Collections.sort(str);
		System.out.println(str);
		
		
		
		int max=Collections.max(numsList);
		int min=Collections.min(numsList);

		System.out.println(max);
		System.out.println(min);
		
		
		String firstName= Collections.max(str);
		String  lastName= Collections.min(str);
		
		System.out.println(firstName);
		System.out.println(lastName);
		
		Collections.shuffle(str);
		System.out.println(str);
	}

}
