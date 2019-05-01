package day28_multiD_Arrays;
import java.io.IOException;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
public class FastFoodRestaurants {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		//read all date and assign to array
		String[]data=Files.readAllLines(Paths.get("FastFoodRestaurants.csv")).toArray(new String[0]);
		
		System.out.println("Data size: "+data.length);
		
		//print first row
		System.out.println(data[0]);
		System.out.println(data[0]);
		System.out.println(data[data.length-1]);
		int count=0;
		for(String line: data) {
			
			System.out.println("#"+count+"=>"+line);
			count++;
		}
		
		//System.out.println(Arrays.toString(data));
		//print each restaurant information in separate line.
		
		//print all restaurant information in state of VA
		
		int counts=0;
		for(String lines: data) {
		if (lines.contains(",VA,")) {
			
			System.out.println(lines);
			counts++;
		}
			}
		
		System.out.println("Total restaurants in VA: "+counts);
		
		//print the restaurant names with cityname
		
		
		int i=0;
		for(String rests:data) {
			if (rests.contains(",VA,")) {
			String[] spl=rests.split(",");
		System.out.println(spl[2]+"-"+spl[1]);
		}
		}
		
		
		
	}

}
