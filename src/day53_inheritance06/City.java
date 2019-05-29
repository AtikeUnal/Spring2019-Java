package day53_inheritance06;
//import java.lang package system,string, Integer java automatically adds.
public class City {  //extends Object automatically

	private int id;
	private String name;
	public int count=100;
	
	
	@Override
	public String toString() {
		return "id:"+id+" name:"+name+" count:"+count;
	}
	public void letsBuildARoad() {
		buildARoad();
		
	}
	 public static void buildARoad() {
		 System.out.println("City -building a road");
	 }
	@Override
	public boolean equals(Object obj) {
		City anothercity =(City) obj;
		if (this.id==anothercity.id&& this.name.equals(anothercity.name)){
		return true;
	}
		return false;
	}
	
	
	
	public City(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override 
	public int hashCode() {
		return name.length();
	}
	
	
	
}
//default constructor has no args and adds call super class constructor using super()
