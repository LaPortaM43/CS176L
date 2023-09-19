package Monmouth;

public class Problem2 {

    public static void main(String[] args) {

        Student x = new Student();
        x.addQuiz(22);
        x.addQuiz(95);
        x.addQuiz(23);
        x.addQuiz(37);
        x.addQuiz(45);
        x.updateName("Tom");

        // Print the name, total score, and average score
        System.out.println("Name: " + x.getName());
        System.out.println("Total Score: " + x.getScore());
        System.out.println("Average Score: " + x.getAverageScore());
    }
}

class Student { // Student is the object 

    String name; // Attribute of Student
    int total_score; // Attribute of Student
    int quiz_count; // Attribute of Student
 
    int getScore() { // get_score is the method 
        return total_score; // local variable 
    }

    void addQuiz(int score) {
        total_score += score; // += is the same as saying x = x + y 
        quiz_count++; // ++ increases variable by 1 
    }

    void updateName(String newName) { // Reseting the name with a local parameter
        name = newName;
    }

    String getName() {
        return name;
    }

    double getAverageScore() {
        if (quiz_count == 0) {
            return 0.0;
        }
        return (double) total_score / quiz_count;
    }
}


	

