package day47_blocks;

public class App {
	
private String  name;

private String developer;

public static int count;

public static void build(String language) {
	System.out.println("Building an app using "+language);
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public App(String name) {
	
	this.name=name;
}
}
