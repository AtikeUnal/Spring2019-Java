package day64_Collections01;
import java.util.*;
public class VectorExample {
public static void main(String[] args) {
	List<String> v =new Vector<>();
	v.add("water");
	v.add("tea");
	v.add("tea");
	v.add("green tea");
	
	
	for(String s:v) {
		System.out.println(s);
	}
	
	System.out.println(v.get(2));
}
}
