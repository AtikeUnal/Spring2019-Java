package day42_customClasses_encapsulation;

public class Person {

	//declare name and age
	
	private String name;
	private int age;


		
	
		//public getter setter methods for name
		
		public String getName() {
			
		return name;
		}
		
		//write only
		public void setName(String name) {
			this.name=name;
			
		}
//refactor encapsulate fields
		private int getAge() {
			return age;
		}

		private void setAge(int age) {
			this.age = age;
		}

	

}

	

