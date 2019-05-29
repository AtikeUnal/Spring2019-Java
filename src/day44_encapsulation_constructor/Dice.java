package day44_encapsulation_constructor;
import java.util.*;
public class Dice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Job job1= new Job();
	Job job2=new Job("Java Developer");
	Job job3= new Job ("SDET","Amazon",130.000);
	
	System.out.println(job1.toString());
	System.out.println(job2.toString());
	System.out.println(job3.toString());
	
	//create a list of Jobs and add 5 different jobs with company,salary title
	
	ArrayList<Job> fiveJob=new ArrayList<>();
	
	Job job4= new Job("SDET","Capital One", 120.00);
	
	Job job5= new Job("SDET","Departmant of defense", 140.00);
	
	fiveJob.add(job3);
	fiveJob.add(job4);
	fiveJob.add(job5);
	fiveJob.add(new Job ("Scrum Master", "Google",123000));
	fiveJob.add(new Job ("SDET","FreddieMac",100000));
	
	System.out.println(fiveJob.toString());
	// find the highest paying job and print toString for that
	
	double maxSalary=0;
	int highestIndex=-1;
	
	for(int i=0;i<fiveJob.size();i++) {
		if(fiveJob.get(i).getAnnualSalary()>maxSalary) {
				maxSalary=fiveJob.get(i).getAnnualSalary();
				highestIndex=i;
		
	}
	}
	
	
	System.out.println("Highest salary "+fiveJob.get(highestIndex));
	
	
	
	
	}
}
