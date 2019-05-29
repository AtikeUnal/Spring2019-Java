package day40_customClasses_methods;

public class Employee {

	
	
	public String name;
	 public String jobTitle;
	double salary;
	
	
	
	//work goToBreak attendMeeting
	//introduce""name[name
	
	public void work() {
		System.out.println(name+ "Working ");
	}
	public void attendMeeeting() {
		System.out.println(name+"is attending the meeting");
	}
	public void introduce() {
		System.out.println("Name["+name+"], job title: ["+jobTitle+"] ,salary [ "+salary+"]");
	}
}
