package edu.monmouth.course;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Course {
    private String courseCode;
    private String department;
    private String level;
    private List<Student> students;

    public Course(String courseCode, String department, String level) {
        this.courseCode = courseCode;
        this.department = department;
        this.level = level;
        this.students = new ArrayList<>();
    }

    public void addStudent(String name, String id) {
        students.add(new Student(name, id));
    }

    public void addGrade(String id, int testNumber, int grade) {
        Student student = findStudentById(id);
        if (student != null) {
            student.addGrade(testNumber, grade);
        } else {
            System.out.println("Error, no student with id '" + id + "' registered in this class.");
        }
    }

    public void printGrade(int testNumber) {
        System.out.println("Result of test " + testNumber + ":");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGrade(testNumber));
        }
    }

    public void sortGrade(int testNumber) {
        Collections.sort(students, (s1, s2) -> s2.getGrade(testNumber) - s1.getGrade(testNumber));
    }

    public void updateGrade(String id, int grade) {
        Student student = findStudentById(id);
        if (student != null) {
            student.updateGrade(grade);
        }
    }

    private Student findStudentById(String id) {
        for (Student student : students) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    private class Student {
        private String name;
        private String id;
        private List<Integer> grades;

        public Student(String name, String id) {
            this.name = name;
            this.id = id;
            this.grades = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public void addGrade(int testNumber, int grade) {
            while (grades.size() <= testNumber) {
                grades.add(-1); // Fill missing test grades with -1
            }
            grades.set(testNumber, grade);
        }

        public int getGrade(int testNumber) {
            if (testNumber < grades.size() && testNumber >= 0) {
                return grades.get(testNumber);
            }
            return -1;
        }

        public void updateGrade(int grade) {
            if (!grades.isEmpty()) {
                grades.set(grades.size() - 1, grade);
            }
        }
    }
}





