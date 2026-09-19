package ooPs;

public class StudentSystem {
    
    // 1. These are "Variables" (Properties or data of a student)
    String studentName = "SHANKAR";
    int studentAge = 20;

    // 2. This is a "Method" (An action the student can do)
    void study() {
        System.out.println(studentName + " is studying Java!");
    }

    public static void main(String[] args) {
        // 3. Creating an "Object" named 'myStudent' from the class
        StudentSystem myStudent = new StudentSystem();

        // 4. Using the object to print the properties
        System.out.println("Student Name: " + myStudent.studentName);
        System.out.println("Student Age: " + myStudent.studentAge);

        // 5. Calling the method using the object
        myStudent.study();
    }
}
