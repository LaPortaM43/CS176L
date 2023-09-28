package edu.monmouth.Problem1Week4;

public class Problem1Week4 {

	public static void main(String[] args) {
		
		StudentGrade matt = new StudentGrade("Matt");
		StudentGrade joe = new StudentGrade("Joe", 71);
		
		System.out.println(matt.getName());
		System.out.println(matt.getGradeLevel());
		System.out.println(matt.getGrade());
		System.out.println("\n" + joe.getName() + "," + joe.getGrade());
		
		matt.setGrade(-1);
		System.out.println("\n" + matt.getGradeLevel());
		System.out.println(matt.getGrade());
		
		matt.setGrade(102);
		System.out.println("\n" + matt.getGradeLevel());
		System.out.println(matt.getGrade());
		
		matt.setGrade(75);
		System.out.println("\n" + matt.getGradeLevel());
		System.out.println(matt.getGrade());
		
	}

}

class StudentGrade {
	
	// constants
	final int DEFAULTGRADE = 60;
	final int MAXIMUMGRADE = 100;
	final int MINIMUMGRADE = 0;
	final int AGRADE = 90; 
	final int BGRADE = 80;
	final int CGRADE = 70;
	
	// Two instance Variables
	private int grade; 
	private String name; 
	
	// Two constructors
	public StudentGrade(String name) { 
		this.name = name;
	}
	
	public StudentGrade(String name, int grade) { 
		this.name = name;
		this.grade = grade;
	}
	
	public String getName() { 
		return name; 	
	}
	
	public void setName(String name) {
		this.name = name;	
	}
	
	public int getGrade() { 
		return grade; 
	}
	
	public void setGrade(int grade) {
		if (grade < MINIMUMGRADE || grade > MAXIMUMGRADE) { 
			this.grade = DEFAULTGRADE;
		} else { 
			this.grade = grade;
		}
	}
	
	public String getGradeLevel() { 
		if (grade > AGRADE) { 
			return "A";
		} else if (grade >= BGRADE && grade < AGRADE) { 
			return "B";
		} else if (grade >= CGRADE && grade < BGRADE) { 
			return "C";
		} else {
			return "D";
	}
	
	
			
			
			
			
		
			
		
	}
	
}









