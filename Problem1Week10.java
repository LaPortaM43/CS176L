package edu.monmouth.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student {
    String name;
    String id;

    Student(String name, String id) {
        this.name = name;
        this.id = id;
    }
}

class Test {
    int testNumber;
    List<Integer> grades;
    List<Student> students;

    public Test(int testNumber) {
        this.testNumber = testNumber;
        this.grades = new ArrayList<>();
        this.students = new ArrayList<>();
    }
}

public class Course {
    String courseCode;
    String department;
    String level;
    List<Student> students;
    List<Test> tests;

    public Course(String courseCode, String department, String level) {
        this.courseCode = courseCode;
        this.department = department;
        this.level = level;
        this.students = new ArrayList<>();
        this.tests = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
        System.out.println("Student added: " + name);
    }

    public void addGrade(String id, int testNumber, int score) {
        Student student = findStudentById(id);
        if (student != null) {
            Test test = findOrCreateTest(testNumber);
            test.students.add(student);
            test.grades.add(score);
            System.out.println("Grade added for: " + student.name);
        } else {
            System.out.println("Error: No student with ID '" + id + "' registered in this class.");
        }
    }

    public void printGrade(int testNumber) {
        Test test = findTest(testNumber);
        if (test != null && !test.students.isEmpty()) {
            System.out.print("Grades for test " + testNumber + ": ");
            for (Student student : test.students) {
                int grade = test.grades.get(test.students.indexOf(student));
                System.out.print(student.name + " " + grade);
                if (test.students.indexOf(student) < test.students.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        } else {
            System.out.println("No grades available for test " + testNumber);
        }
    }

    public void sortGrade(int testNumber) {
        Test test = findTest(testNumber);
        if (test != null && test.students.size() > 1) {
            Collections.sort(test.students, (s1, s2) -> Integer.compare(test.grades.get(test.students.indexOf(s2)), test.grades.get(test.students.indexOf(s1))));
            System.out.println("Grades sorted for test " + testNumber);
        } else {
            System.out.println("Not enough grades to sort for test " + testNumber);
        }
    }

    public void updateGrade(String id, int newScore) {
        Student student = findStudentById(id);
        if (student != null) {
            for (Test test : tests) {
                int index = test.students.indexOf(student);
                if (index != -1) {
                    test.grades.set(index, newScore);
                    System.out.println("Grade updated for: " + student.name);
                    return;
                }
            }
        }
        System.out.println("Student with ID '" + id + "' not found.");
    }

    private Student findStudentById(String id) {
        for (Student student : students) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        return null;
    }

    private Test findTest(int testNumber) {
        for (Test test : tests) {
            if (test.testNumber == testNumber) {
                return test;
            }
        }
        return null;
    }

    private Test findOrCreateTest(int testNumber) {
        Test test = findTest(testNumber);
        if (test == null) {
            test = new Test(testNumber);
            tests.add(test);
        }
        return test;
    }

    public static void main(String[] args) {
        Course cs176l = new Course("cs176l", "Computer science", "undergraduate");
        cs176l.addStudent("Cream", "0000001");
        cs176l.addGrade("0000001", 1, 98);
        cs176l.addStudent("Oreo", "0000002");
        cs176l.addGrade("0000002", 1, 99);

        cs176l.printGrade(1); // Cream 98, Oreo 99
        cs176l.sortGrade(1); // Sorting based on descending order
        cs176l.printGrade(1); // Oreo 99, Cream 98

        cs176l.updateGrade("0000001", 100);
        cs176l.printGrade(1); // Oreo 99, Cream 100

        cs176l.sortGrade(1); // Sorting based on descending order
        cs176l.printGrade(1); // Cream 100, Oreo 99

        // Error, no student with id '0000003' registered in this class.
        cs176l.addGrade("0000003", 2, 88);

        cs176l.addStudent("Derek", "0000003");
        cs176l.addGrade("0000003", 2, 88);
        cs176l.printGrade(2); // Derek 88
    }
}

