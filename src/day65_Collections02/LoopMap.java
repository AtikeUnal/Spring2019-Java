package day65_Collections02;
import java.util.*;
public class LoopMap {

	public static void main(String[] args) {
		
	
	
	Map<String, String>dataMap=new HashMap<>();
	
	
	dataMap.put("url", "qa3.vytrack.com");
	dataMap.put("userName", "user27");
	dataMap.put("password", "UserUser123");
	dataMap.put("browser", "chrome");
	dataMap.put("storemanager", "John Doe");
	
	
	//keySet -> returns set with all the keys in the map
	//values -> returns list with all the values in the map
	System.out.println("########KEYS##########");
	for(String key :dataMap.keySet() ) {
	System.out.println(key);
	
}
	System.out.println("#######VALUES########");
	for(String value : dataMap.values() ) {
		
		System.out.println(value);
	}
	
	
	for(String key :dataMap.keySet() ) {
			System.out.println(key+"|"+dataMap.get(key));
			
			
		}
	
	
	Map<String, String[]> data=new HashMap<>();
	
	Map <Integer, List<String>> data3=new HashMap<>();
	Map <String, Map<Integer,Integer>> data2=new HashMap<>();
	
	
	
	}
}