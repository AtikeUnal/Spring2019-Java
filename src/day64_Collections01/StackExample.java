package day64_Collections01;

import java.util.*;

public class StackExample {
	public static void main(String[] args) {
		Stack<Integer> numsStack = new Stack<>();
		numsStack.add(5);
		
		numsStack.push(31);
		numsStack.push(30);
		numsStack.push(309);
		System.out.println(numsStack.toString());
		System.out.println(numsStack.peek());
		
		
		//read value on top of stack then remove it
		System.out.println(numsStack.pop());
		System.out.println(numsStack.peek());
		System.out.println(numsStack.get(2));
	
	
	}
}
