package day50_inheritance03;

public class Contractor extends Employee{

	@Override
				
	public void CalculatePay(int hours, int rate) {
		double total=hours*rate+200;
		System.out.println("Contractor total pay: "+total);
	}
}
