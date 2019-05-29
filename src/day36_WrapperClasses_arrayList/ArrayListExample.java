package day36_WrapperClasses_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ArrayList <String> languages=new ArrayList<>();
		
		languages.add("Java");
		languages.add("English");
		languages.add("Spanish");
		languages.add("Turkish");
		languages.add("Russian");
		languages.add("Ukranian");
		languages.add("Azerbaijani");
		
		System.out.println("Number of values: "+languages.size());
		languages.add("French");
		System.out.println("Number of values: "+languages.size());

		//remove java
		languages.remove(0);
		System.out.println("Number of values: "+languages.size());
		System.out.println(languages.toString());
	}

}
