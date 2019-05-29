package day38_ArrayList03;
import java.util.*;
public class ContainsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	ArrayList<String> list1 =new ArrayList<>();
	list1.add("Jan");
	list1.add("Feb");
	list1.add("Mar");
	list1.add("Apr");
	list1.add("May");
	
	
	System.out.println(list1);
	
	
	ArrayList<String> months = new ArrayList<>(list1);
	System.out.println(months);
	
	
	 months.add("Jun");
     months.add("Jul");
     months.add("Aug");
     
     System.out.println(months.contains("Jan"));
	System.out.println(months.contains("Dec"));
	
	
	System.out.println(months);
	
	System.out.println(months.contains("Jun"));
	
	//how would you check if Feb is in second position 
	System.out.println(months.indexOf("Feb")==1);
	System.out.println(months.get(1).equals("Feb"));
	
	ArrayList <String> month2=new ArrayList<>(list1);
	System.out.println("Months: "+months.toString());
	
	System.out.println("Months "+ month2.toString());
	
	//check if month has all the values of month2
	
	
	if(months.containsAll(month2)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	//add one more Jan to month2
	
	month2.add("Jan");
	if(months.containsAll(month2)) {
		System.out.println(true);
	}else {
		System.out.println(false);
	}
	}

}
