package day45_encapsulation_constructor_Practice;
import java.util.*;
public class Canvas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Course nCourse1 =new Course();
		nCourse1.setName("Java Programming");
		List <String> javaTeachers = new ArrayList<>();
		javaTeachers.add("Murodil");
		javaTeachers.add("Vasyl");
		javaTeachers.add("Muhtar");
		javaTeachers.add("MarufJon");
		
		nCourse1.setTeachers(javaTeachers);
		System.out.println(nCourse1);
		
		List <String> javaStudents = new ArrayList<>();
		
		javaStudents.add("Atike");
		javaStudents.add("Mualla");
		javaStudents.add("Muhabbat");
		javaStudents.add("Gulnar");
		
		nCourse1.setStudents(javaStudents);
		System.out.println(javaStudents);
		
		
		nCourse1.addTeacher("Maria");
		nCourse1.addStudent("Kate");
		
		if(nCourse1.getTeachers().contains("Maria")) {
			System.out.println("Maria is a teacher ");
		}else {
			System.out.println("Maria is not a teacher");
		}
		
		if(nCourse1.getStudents().contains("Kate")) {
			System.out.println("Kate is a student ");
		}else {
			System.out.println("Kate is not a student");
		}
		
		nCourse1.removeTeacher("Murodil");
		nCourse1.removeStudent("Roman");
		
		if(!nCourse1.getTeachers().contains("Murodil")) {
			System.out.println("murodil is not a teacher ");
		}else {
			System.out.println("Murodil is a teacher");
		}
		
		if(!nCourse1.getStudents().contains("Roman")) {
			System.out.println("Roman is not a student ");
		}else {
			System.out.println("Roman is  a student");
		}
		
	}

}
