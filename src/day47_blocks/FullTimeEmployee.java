package day47_blocks;

public class FullTimeEmployee extends Employee {

	@Override
	public void  CalculatePay(int hours, int rate) {
		
		double total=(hours*rate)*1.05;
		System.out.println("Employee total pay: " +total);
		
		
	}
}


