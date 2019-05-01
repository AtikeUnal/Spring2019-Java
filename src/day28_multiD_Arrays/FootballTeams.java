package day28_multiD_Arrays;

import java.util.Arrays;

public class FootballTeams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] teams = new String[2][6];
		
		
		
		teams[0][0]="Irina";
		teams[0][1]="Zarif";
		teams[0][2]="Cihan";
		teams[0][3]="Habib";
		teams[0][4]="Adel";
		teams[0][5]="Bojan";
		
		teams[1][0]="Olimjan";
		teams[1][1]="mirshad";
		teams[1][2]="Usman";
		teams[1][3]="Nursultan";
		teams[1][4]="Roman";
		teams[1][5]="Dimitry";
		
		
		
		//declara multi d array two rows and 6 columns
		
		System.out.println("First plyer of first team: ");
		System.out.println(teams[0][0]);  //irina
		
		System.out.println(teams[0][3]);   //habib
		
		System.out.println(teams[1][5]);   //seda
		
		//print how many rows 
		
		System.out.println("numbers of the teams: "+teams.length);
		
		//print how many people in the team
		
		System.out.println("number of people in the first team: "+teams[0].length);
		System.out.println("number of people in the second team: "+teams[1].length);
		
		
		System.out.println(Arrays.deepToString(teams));
		
		
		int[][]cities=new int[3][4];
		
		
		cities[0][0]=100;
		cities[0][1]=500;
		cities[0][2]=1234;
		cities[0][3]=567;
		
		
		cities[1][0]=56327;
		cities[1][1]=1567;
		cities[1][2]=5467;
		cities[1][3]=56767;
		
		cities[2][0]=542367;
		cities[2][1]=5634327;
		cities[2][2]=569877;
		cities[2][3]=5678687;
		
		
		
		System.out.println(Arrays.deepToString(cities));
		System.out.println(cities[0]);
		
		
		
		
		
		
		int [][]scores={{3,5,10},{6,7,9,10} };
		
		System.out.println("Days played/Number of arrays: "+scores.length);
		System.out.println("Numbers of values in 1: "+scores[0].length);
		System.out.println("Numbers of values in 2: "+scores[1].length);
		
		
		
		int [][]values=new int[4][];
		
		values[0]=new int [] {434,34,34};
		values[1]=new int [] {43,32,12,1,435,67,889,655,889,32,111,4444,6778,89};
		
		
		values[2]=new int[2];
		values[2][0]=55;
		values[2][1]=88;
		
		values[3]=new int [] {3,6,7,8,9};
		
		
		
	}

}
