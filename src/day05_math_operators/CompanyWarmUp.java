package day05_math_operators;

public class CompanyWarmUp {
	public static void main(String [] args) {
	String companyName= "Facebook";
	String adress= "Slicon Valley, CA";
	int numberOfEmployees= 1000;
	long revenue=4000000L;
	 boolean isTechCompany= true;
	 
			 System.out.println("Compan name is "+ companyName);
			 System.out.println("adress is "+adress);
			 System.out.println("number of employees is "+ numberOfEmployees);
			 System.out.println("Annual revenue is "+revenue);
			 System.out.println("is it tech company?- " + isTechCompany);
			 System.out.println();
			 //to make a space between lines just write a sysout
String aboutCompany="Company"+companyName+ " is located in "+ adress +"\n and "+numberOfEmployees +" work for it.";
//\n qoutation in icine koyunca alt satira gecer
//\t tab yapar
System.out.println(aboutCompany);
}
}