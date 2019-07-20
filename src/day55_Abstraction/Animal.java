package day55_Abstraction;

public abstract class Animal {
private String name;


public Animal(String name) {
	this.name=name;
}
	public abstract void speak(); // we cannot have abstract methods in regular classes.

	// dog speak woof woof

	// cat speaks meooooow

	//pig speaks oink
	
	// 
public abstract void eat();

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
}
