package day42_customClasses_encapsulation;
import java.util.*;
import java.lang.*;
public class StringShoesToObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String data="Bruno Magli,9.5";
		//split using , and store
		String []arrData=data.split(",");
		Shoes shoes =new Shoes();
		
		shoes.setShoesData(arrData[0], Double.parseDouble(arrData[1]));
		Scanner scan=new Scanner(System.in);
		System.out.println("What shoes brand? ");
		String brand= scan.next();
		System.out.println("What is your Size?");
		double size=scan.nextDouble();
		
		
		
		Shoes shoe1= new Shoes();
		shoe1.brand=brand;
		shoe1.size=size;
		//shoe1.setShoesData(brand, size);
		System.out.println(shoe1.getShoesData());
		
	}

}
