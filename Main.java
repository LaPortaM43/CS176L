package edu.monmouth.course;

public class Main {
    public static void main(String[] args) {
        Course cs176l = new Course("cs176l", "Computer science", "undergraduate");

        cs176l.addStudent("Cream", "0000001");
        cs176l.addGrade("0000001", 0, 98); 

        cs176l.addStudent("Oreo", "0000002");
        cs176l.addGrade("0000002", 0, 99); 

        cs176l.printGrade(0); 

        cs176l.sortGrade(0); 
        cs176l.printGrade(0); 

        cs176l.updateGrade("0000001", 100);
        cs176l.printGrade(0); 

        cs176l.sortGrade(0); 
        cs176l.printGrade(0); 

        cs176l.addGrade("0000003", 1, 88); 
        cs176l.addStudent("Derek", "0000003");
        cs176l.addGrade("0000003", 1, 88);

        // Additional test case
        cs176l.printGrade(1); // Derek 88
    }
}
