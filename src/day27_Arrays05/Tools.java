package day27_Arrays05;

public class Tools {
	public static void main(String[] args) {

//	Java --> programming language
//	Selenium --> Test Automation
//	TestNG --> Unit Tests
//	JUnit --> Unit Tests
//	Cucumber --> BDD Style testing
//	Git --> Version control
//	Maven --> Building and execution for project
//	

		String[] tools = { "Java", "Selenium", "TestNG", "JUnit", "Cucumber", "Git", "Maven" };

		for (String prog : tools) {

			switch (prog.toLowerCase()) {
			case "java":
				System.out.println("programming language");
				break;
			case "selenium":
				System.out.println("Test Automation");
				break;
			case "junit":
			case "testng":
				System.out.println("Unit Tests");
				break;
			case "cucumber":
				System.out.println("BDD Style testing");
				break;
			case "git":
				System.out.println("Version control");
				break;
			case "maven":
				System.out.println("Building and execution for project");
				break;
				default:
					System.out.println("Unknown tool");
					break;//optional
			}
		}

		
		
		
		
		
		
	}
}