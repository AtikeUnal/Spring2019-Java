package day40_customClasses_methods;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1=new Employee();
		emp1.name="Kate";
		emp1.jobTitle="Developer";
		emp1.salary=115.00;
		
		emp1.work();
		emp1.attendMeeeting();
		emp1.introduce();
		
		emp1.jobTitle="Lead";
		emp1.salary=120.00;
		emp1.introduce();
		
	}

}
