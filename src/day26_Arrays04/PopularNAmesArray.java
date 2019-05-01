package day26_Arrays04;

import java.util.*;
import java.util.Arrays;

public class PopularNAmesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = { "James", "Mary", "John", "Patricia", "Robert", "Jennifer", "Michael", "Linda", "William",
				"Elizabeth", "David", "Barbara", "Richard", "Susan", "Joseph", "Jessica", "Thomas", "Sarah", "Charles",
				"Margaret", "Christopher", "Karen", "Daniel", "Nancy", "Matthew", "Lisa", "Anthony", "Betty", "Donald",
				"Dorothy", "Mark", "Sandra", "Paul", "Ashley", "Steven", "Kimberly", "Andrew", "Donna", "Kenneth",
				"Emily", "George", "Carol", "Joshua", "Michelle", "Kevin", "Amanda", "Brian", "Melissa", "Edward",
				"Deborah", "Ronald", "Stephanie", "Timothy", "Rebecca", "Jason", "Laura", "Jeffrey", "Helen", "Ryan",
				"Sharon", "Jacob", "Cynthia", "Gary", "Kathleen", "Nicholas", "Amy", "Eric", "Shirley", "Stephen",
				"Angela", "Jonathan", "Anna", "Larry", "Ruth", "Justin", "Brenda", "Scott", "Pamela", "Brandon",
				"Nicole", "Frank", "Katherine", "Benjamin", "Samantha", "Gregory", "Christine", "Raymond", "Catherine",
				"Samuel", "Virginia", "Patrick", "Debra", "Alexander", "Rachel", "Jack", "Janet", "Dennis", "Emma",
				"Jerry", "Carolyn", "Tyler", "Maria", "Aaron", "Heather", "Henry", "Diane", "Jose", "Julie", "Douglas",
				"Joyce", "Peter", "Evelyn", "Adam", "Joan", "Nathan", "Victoria", "Zachary", "Kelly", "Walter",
				"Christina", "Kyle", "Lauren", "Harold", "Frances", "Carl", "Martha", "Jeremy", "Judith", "Gerald",
				"Cheryl", "Keith", "Megan", "Roger", "Andrea", "Arthur", "Olivia", "Terry", "Ann", "Lawrence", "Jean",
				"Sean", "Alice", "Christian", "Jacqueline", "Ethan", "Hannah", "Austin", "Doris", "Joe", "Kathryn",
				"Albert", "Gloria", "Jesse", "Teresa", "Willie", "Sara", "Billy", "Janice", "Bryan", "Marie", "Bruce",
				"Julia", "Noah", "Grace", "Jordan", "Judy", "Dylan", "Theresa", "Ralph", "Madison", "Roy", "Beverly",
				"Alan", "Denise", "Wayne", "Marilyn", "Eugene", "Amber", "Juan", "Danielle", "Gabriel", "Rose", "Louis",
				"Brittany", "Russell", "Diana", "Randy", "Abigail", "Vincent", "Natalie", "Philip", "Jane", "Logan",
				"Lori", "Bobby", "Alexis", "Harry", "Tiffany", "Johnny", "Kayla" };

//		for(String s:names) {
//			System.out.println(s);
//		}
		System.out.println("Total names: " + names.length);

		System.out.println(Arrays.toString(names));

		for (int i = 0; i < names.length; i += 2) {
			System.out.println(names[i] + ", " + names[i + 1]);

		}
		System.out.println("MALE NAMES: ");
		for (int i = 0; i < names.length; i += 2) {
			if (i == names.length - 1) {
				System.out.print(names[i]);

			} else {
				System.out.print(names[i] + ", ");
			}

		}
		System.out.println();
		System.out.println("FEMALE NAMES: ");
		for (int i = 1; i < names.length; i += 2) {
			if (i == names.length - 1) {
				System.out.print(names[i]);

			} else {
				System.out.print(names[i] + ", ");
			}

		}
		System.out.println();
		Random random = new Random();

		int r = random.nextInt(names.length);

		System.out.println("Random name: " + names[r]);

		// print all names that are up to 4 characters in uppercase in same line

		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				System.out.print(names[i].toUpperCase() + ", ");
			}
		}
		
System.out.println();
	
		String names3to4 = "";
		String names5to6 = "";
		String names7orMore = "";

	
		for (int i = 0; i < names.length; i++) {
			if (names[i].length() <= 4) {
				names3to4+=names[i]+", ";
			}else if(names[i].length()==5|| names.length==6) {
				names5to6+=names[i]+", ";
			}else {
				names7orMore+=names[i]+", ";
			}
		}
				System.out.println("names3to4: "+names3to4.substring(0,names3to4.length()-2)); //sondaki virgulu silmek icin
				System.out.println("names5to6: "+names5to6.substring(0,names5to6.length()-2));
				System.out.println("names7orMore: "+names7orMore.substring(0,names7orMore.length()-2));
	
				
				
				
				System.out.println(Arrays.toString(names));
				
				String temp2="";
				for(int i=0;i<names.length;i+=2) {
					String temp=names[i];
					names[i]=names[i+1];
					names[i+1]=temp;
				
				
				
			//	System.out.println(names[i]+", "+temp);
				
				}

				System.out.println(Arrays.toString(names));
				
				
}}
