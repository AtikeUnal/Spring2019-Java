package day56_Abstraction02;

public abstract class Browser {
	
	
	
	
	String name;
	static int id;
	
	
	
	public Browser() {
		System.out.println("creating a Browser");
	}
	public Browser(String name, int id) {
		this.name = name;
		this.id = id;
	}


	 abstract void navigate(String url);

	public abstract void displayWebPage();

	public abstract boolean launch();

	public void close() {
		System.out.println("Exitting the browser.");
	}
}
