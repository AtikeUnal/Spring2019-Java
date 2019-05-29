package day46_static_keyword;

public class Ebay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer cm1 =new Customer("Abdallah Aleies","abdallah@gmail.com");
		Customer cm2 =new Customer ("ADILET KYRGYZ", "adilet@yahoo.com");
		Customer cm3 =new Customer ("Anastasiia Zasibna", "Anastasiia@outlook.com");
		
		
		System.out.println(cm3.count);
		
		System.out.println(Customer.count);
		
		Customer cm4 =new Customer ("Burak Ucal", "burak@outlook.com");
		
		System.out.println("Total customers: "+Customer.count);
		
		cm1.count=10;
		System.out.println(cm3.count);
		
	}

}
