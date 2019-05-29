package day43_encapsulation_constructor;

public class Pet {

	
	
	private String type;
	private String name;
	
	
	public Pet(String type,String name) {
		this.name=name;
		this.type=type;
		
	}
	public Pet() {
		System.out.println("No args constructor");
		
	}
	public void speak() {
		
		switch (type.toLowerCase()) {
		case "cat":
			System.out.println("Miyaww");
			break;
		case "dog":
			System.out.println("gav gav |woof woof");
			break;
		case "bird":
			System.out.println("cik cik");
			break;
		case "goat":
		case "sheep":
			System.out.println("baaaa");
			break;
		case "rooster":
			System.out.println("ooooorroorrr");
			break;
			default:
				System.out.println(".....");
		}
	}
	
	public String toString() {
		return "Pet [type=" + type + ", name=" + name + "]";
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
