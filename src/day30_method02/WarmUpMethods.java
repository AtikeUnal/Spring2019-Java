package day30_method02;

import java.util.Iterator;
import java.util.*;

import day07_scanner_operators.scanner_operators;

public class WarmUpMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 0; i < 100; i++) {
			print5Stars();

		}

//		introduce();
//		introduce();
//		showMe5Numbers();
//		doPush10Ups();
//		rangePrint();
		rangePrint();
	}

	public static void print5Stars() {
		System.out.println("* * * * *");
	}

	public static void introduce() {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = scan.next();
		System.out.println("Nice to meet you, " + name);
	}

	public static void showMe5Numbers() {
		Random rnd=new Random();
		for(int i=0;i<5;i++) {
		
		System.out.print(rnd.nextInt(1001)+" ");
		}
		System.out.println();
	}
	
	public static void doPush10Ups() {
		
		
		for(int i=0;i<10;i++) {
			System.out.println("Pushup - "+(i+1));
		}
		System.out.println("Time to rest");
	}
	
	public static void rangePrint() {
		System.out.println("Enter 2 nums");
		Scanner scan=new Scanner(System.in);
		
		int range1=scan.nextInt();
		int range2=scan.nextInt();
		
		if(range1<range2) {
		for(int i=range1;i<=range2;i++) {
			System.out.print(i+" ");
			
		}
		}else if(range1>range2)	{
			for(int j=range1; j>=range2; j--) {
				System.out.print(j+" ");
			}
		}else {
				System.out.println(range1);
			}
		System.out.println();
	}

	
	
	
	
	

	
	
}
