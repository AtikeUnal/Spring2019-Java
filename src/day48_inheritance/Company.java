package day48_inheritance;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee emp1 =new Employee();

emp1.name="MarufJon";
emp1.jobTitle="Teacher";
emp1.gender='m';
emp1.age=22;



Employee emp2= new Employee() ;
emp2.name="kiki";
emp2.jobTitle="HR";
emp2.age=26;
emp2.gender='f';


emp1.work();
emp2.work();
	

emp1.eat("chicken kesadia");
emp2.eat("salad");
emp1.walk();
emp1.sleep(5);
emp2.sleep(8);
	}

}
