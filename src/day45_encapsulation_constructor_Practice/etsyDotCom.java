package day45_encapsulation_constructor_Practice;

public class etsyDotCom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Etsy acct1=new Etsy();
		System.out.println(acct1);
		acct1.setEmail("ilhanatike@gmail.com");
		acct1.setFirstName("Atike");
		acct1.setPassword("bulgaria123");
		System.out.println(acct1.toString());
		
		
		Etsy acct2 = new Etsy();
		acct2.setEmail("helileva.info");
		acct2.setFirstName("helirana123");
		acct2.setPassword("aass");
		System.out.println(acct2.toString());
		
		
		
		Etsy acct3 =new Etsy("xeka@royalmail.top","Awka","hre4");
		System.out.println(acct3.toString());
		
		Etsy acct4 =new Etsy("woodenspoon@gmail.com","Wdnspn");
		System.out.println(acct4);
		
		final String password ="cphwwkw";
		
		
	}

}
