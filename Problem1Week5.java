package edu.monmouth.problem1Week5;

import java.util.Scanner;

public class Problem1Week5 {

	public static void main(String[] args) {
		
		// Scanner scanner = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String name1 = in.next();
		
		System.out.println("Enter second name: ");
		String name2 = in.next();
		
		if (name1.equals(name2)) { 
			System.out.println("Both names are the same");
		} else { 
			System.out.println(name1 + " and " + name2 + " are different names");
		}
	}

}
