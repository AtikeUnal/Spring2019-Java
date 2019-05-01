package day10_logicaloperators_conditionals;

public class IfStatementWithBooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isBreakTime=false;
		if(isBreakTime==true) {
		System.out.println("BREAK TILL 8:35 PM");
		
	}else {
		System.out.println("Not Break Time Yet.");
	}
		
	//second version
		
		if(isBreakTime) {
			System.out.println("BREAK TILL 8:35 PM");
			
		}else {
			System.out.println("Not Break Time Yet.");
		}
		
		boolean classTime=false;
		if(classTime) {//==false
		System.out.println("Come back on time");	
		System.out.println("Stop talking");
		System.out.println("Pay Attention");
		System.out.println("Code and Have fun");
		}else {
			System.out.println("Take a walk and have some tea");
		}
		
		boolean qualified = false;
		
		if (qualified==false) {//qualified!=true
			
		System.out.println("your application was not approved.Thank you!");
		}

		
		
		if (qualified) {
			
		}else {		System.out.println("your application was not approved.Thank you!");

		
		}	
		
}

}
