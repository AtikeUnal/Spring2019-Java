package day43_encapsulation_constructor;

public class MicroCenter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Computer comp1 = new Computer();
		Computer comp2 =new Computer();
		
		
		
		System.out.println(comp1);
		System.out.println(comp2);
		
		comp1.setBrand("iMac");
		comp1.setOs("MacOs");
		comp1.setPrice(2000);
		
		comp2.setBrand("Dell XPS");
		comp2.setOs("Windowns 10" );
		comp2.setPrice(1300);
		
		System.out.println(comp1);
		System.out.println(comp2);
		
		
		Computer comp3 =new Computer("Asus","Windows 7",645.5);
		
		System.out.println(comp3.toString());
		
		comp3.setOs("Windows 11");
		
		System.out.println(comp3);
		
		
		comp3.setPrice(comp3.getPrice()-200);
		System.out.println(comp3.toString());
		
		
		
	}

}
