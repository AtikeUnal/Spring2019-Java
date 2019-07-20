package day64_Collections01;

import java.util.*;

public class SetExample {
	public static void main(String[] args) {
		Set<Integer> MySet = new HashSet<>();
		MySet.add(100);
		MySet.add(200);
		MySet.add(300);
		MySet.add(400);
		MySet.add(500);
		MySet.add(600);
		MySet.add(200);
		MySet.add(200);
		MySet.add(200);

		System.out.println(MySet.toString());
		System.out.println(MySet.size());
		
		
		List <String> str= Arrays.asList("a","a","b", "b ","aa", "qa", "27");
		Set<String> unique =new HashSet<>(str);
		System.out.println(unique.toString());
		
		
		TreeSet<Integer> tree= new TreeSet<>();
		
		tree.add(1);
		tree.add(4000);
		tree.add(3);
		tree.add(20);
		tree.add(900);
		tree.add(900);
		
		System.out.println(tree.toString());
		
		
		
	}
}
