package edu.monmouth.problem1Week8;

import java.util.Scanner;

public class Problem1Week8 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String word = input.nextLine();
		StringBuilder noSpaces = new StringBuilder();
		
		
		
		for (int i = 0; i < word.length(); i++) { 
			
			char c = word.charAt(i);
			if (Character.isWhitespace(c) == false) { 
				noSpaces.append(c);
			} else {
				continue;
			}	
		
		}
			
		System.out.println(noSpaces);
			

	}

}
