package edu.monmouth.problem2Week5;

import java.util.Scanner;

public class Problem2Week5 { 

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.printf("Enter integer 1: \n");
		int number1 = in.nextInt(); // nextInt for int, next for string 
		
		System.out.printf("Enter an integer 2: \n");
		int number2 = in.nextInt(); 
		
		System.out.printf("Enter an operator: \n");
		String operator = in.next();
		
		double result = 0.0;

	    if (operator.equals("+")) {
	    	result = number1 + number2;
	    } else if (operator.equals("-")) {
	    	result = number1 - number2;
	    } else if (operator.equals("*")) {
	    	result = number1 * number2;
	    } else if (operator.equals("/")) {
	    	result = number1 / number2;
	    } else {
	    	System.out.printf("Invalid operator \n");
	    }

	    System.out.printf("Result: %.2f", result);

		
		}
	}
