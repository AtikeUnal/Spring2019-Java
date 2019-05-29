package day48_inheritance;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Person ppl =new Person();
Student std=new Student();

ppl.name="Obama";
ppl.age=57;
ppl.gender='M';


std.name="Atike";
std.age=32;
std.gender='F';


ppl.eat("steak");

std.eat("greckha");


std.walk();
ppl.walk();

std.sleep(6);


Student student2=new Student();

student2.name="Orhan";
student2.age=40;
student2.gender='m';
student2.studentId=4040;
student2.takeClass="Agile scrum";


student2.code("Java");
student2.attendClass();
student2.eat("Kebab");

student2.walk();
std.code("C+");
	}

}
