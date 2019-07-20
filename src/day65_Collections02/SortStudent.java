package day65_Collections02;
import java.util.*;



public class SortStudent   {
	
	
public static void main(String[] args) {
	
	List<Student> stList=new ArrayList<>();
	
	
	stList.add(new Student(200, "Roman"));
	stList.add(new Student(234, "Ibrahim"));
	stList.add(new Student(204, "Gulnar"));
	stList.add(new Student(230, "Anara"));
	stList.add(new Student(20, "Vlad"));
	
	System.out.println(stList.toString());
	
	Collections.sort(stList);
	
	
	System.out.println(stList.toString());
	
	Student student1 = new Student (10, "Abiy");
	Student student2 = new Student (20, "Olena");
	System.out.println(student1.compareTo(student2));
	
	
	
}
}
