package day47_blocks;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		Employee emp1 =new Employee();
		FullTimeEmployee full= new FullTimeEmployee();
		Contractor ct =new Contractor();
		
		emp1.CalculatePay(40, 40);
		full.CalculatePay(40, 45);
		ct.CalculatePay(40, 55);
	}

}
