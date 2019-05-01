package day33_method05;

public class PayCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getHourlyPay(0,4));
		
		
		
		
		
	}
public static int getHourlyPay(int hours, int rate ) {
	
	if(hours<=0) {
		System.out.println("Invalid hours");
		return 0;
	}
	if(rate<=0) {
		System.out.println("Invalid rate");
		return 0;
	}
	int total=hours*rate;
	return total;
}
}
