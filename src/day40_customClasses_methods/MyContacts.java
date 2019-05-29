package day40_customClasses_methods;

public class MyContacts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Contact cont1=new Contact ();
		cont1.name="Evgenia Jalilova";
		cont1.phoneNumber="202-555-555";
		cont1.email= "evgenia@thorlabs.com";
		cont1.call();
		cont1.sendMessage();
		cont1.sendEmail();
		System.out.println("########");
		Contact orhan= new Contact();
		
		orhan.name="Orhan Sultanov";
		orhan.phoneNumber="202-888-777";
		
		orhan.email="orhan@google.com";
		
		System.out.println("Name: "+ orhan.name);
		System.out.println("Phone  number: "+orhan.phoneNumber);
		System.out.println("Email: "+orhan.email);
		
		
		orhan.call();
		orhan.sendEmail();
		orhan.sendMessage();
		
		
		cont1.call();
	}

}
