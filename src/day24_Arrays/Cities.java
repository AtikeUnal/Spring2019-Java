package day24_Arrays;

public class Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		String []cities= {"Washington DC.","Kyiev","Annandale","Moscow","Istanbul","Baku","Miami","Silver Spring","McLean"};
		
		System.out.println(cities.length);//to find out how many elements in the array
		
		//task : print all cities that starts with "M"
		
		
		for(int i=0;i<cities.length;i++) {
			if(cities[i].startsWith("M")) {
				System.out.println(cities[i]);
			}
		}
		for(String city: cities) {
			System.out.println(city);
		}
	}

}
