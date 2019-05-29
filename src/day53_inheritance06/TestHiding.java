package day53_inheritance06;

public class TestHiding {

	
	
	public static void main(String[] args) {
		
		
		City city1=new City(231,"London");
		
		Capital cap =new Capital(435, "Paris",45473543L);
		System.out.println(city1.count);
		System.out.println(cap.count);
		
		System.out.println(cap.toString());
		System.out.println(city1);
		
		
		cap.displayCount();
		City.buildARoad();
		cap.buildARoad();
		
		City.buildARoad();
		Capital.buildARoad();
		
		System.out.println("~~~~~~~~~~~~~~");
		City city2 =new City(333,"Fairfax");
		Capital capital2 =new Capital(543749386,"Richmond ",43243245235L);
		
		
		
		city2.letsBuildARoad();
		capital2.letsBuildARoad();
	}
	
	
}
