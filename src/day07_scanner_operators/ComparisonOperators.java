package day07_scanner_operators;

public class ComparisonOperators {

	public static void main(String[] args) {
//==
		System.out.println(5==5);//generates boolean operators true or false
		System.out.println(50==5);//false
		int searchCount= 5000;
		System.out.println(searchCount==5000);
		
		int expectedCount= 5010;
		System.out.println(searchCount==expectedCount);
		int speedLimit= 55;
		int currentSpeed= 75;
		System.out.println(currentSpeed==speedLimit);
	
		boolean atLimit= currentSpeed==speedLimit;
		System.out.println("At Speed limit: "+ atLimit);
		boolean overLimit= currentSpeed > speedLimit;
		System.out.println("Over Speed Limit:" + overLimit);
		boolean underLimit= currentSpeed<speedLimit;
		System.out.println("Under the Limit: "+ underLimit);
		
		double balance = 150.0;
		boolean broke= balance <=0.0;
		System.out.println("Broke?- "+ broke);
		double transaction= 155.5;
		broke=(balance-transaction)< 0;
		System.out.println("will make broke/negative?- "+broke);
		
		System.out.println("balance: "+balance);
		System.out.println("transaction: "+ transaction);
		
		
		
		
		
		
		
		
	}

}
