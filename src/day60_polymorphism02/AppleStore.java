package day60_polymorphism02;

public class AppleStore {
	public static void main(String[] args) {
		
				AppleDevice mac = new Mac();
				mac.use();
				//mac.code(); code is not visible.
				//AppleDevice methods only can be called
				Mac myMac = new Mac();
				myMac.use();
				myMac.code();

				AppleDevice watch = new AppleWatch();
				watch.use();
				//watch.wear(); <- ERROR

				AppleDevice dev1 = new Mac();
				System.out.println(dev1.startingPrice);
				//System.out.println(dev1.model); <== ERROR 

				AppleDevice dev2 = new Ipad();
				System.out.println( dev2.startingPrice );
				//System.out.println(dev2.maxScreenSize); <== ERROR
				Ipad ipad = new Ipad();
				System.out.println(ipad.startingPrice); //Good
				System.out.println(ipad.maxScreenSize); //Good


}}