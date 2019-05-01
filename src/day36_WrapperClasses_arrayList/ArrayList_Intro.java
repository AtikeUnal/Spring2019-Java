package day36_WrapperClasses_arrayList;
import java.util.ArrayList;
public class ArrayList_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create an arraylist
		
		ArrayList<String> names= new ArrayList<>();
		
		
		//ArrayList <int> num= new ArrayList<>();//doesnot work because it is not an object
		
		
		ArrayList<Integer> num=new ArrayList<>();
		
		
		
		//how to assign values into arraylist
		
		
		names.add("Atike");
		names.add("Esat");
		names.add("Vedat");
		names.add("Ahmet");
		names.add("Tarik");
		
		
		
		
		num.add(12);
		num.add(382742);
		num.add(89);
		num.add(6722);
		
		
		
		
		//read fromArrayList
		
		
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		System.out.println(names.get(3));
		System.out.println(names.get(4));
		
	System.out.println("Names count "+names.size());
	System.out.println("Nums count "+num.size());
	
	
	}

}
