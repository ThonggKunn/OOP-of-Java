package Main.Task3;

import java.util.Scanner;

public class Human {


    protected String name;
    protected int yearOfBirth;

    //constructor
    public Human(String name, int yearOfBirth) {
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }

    public Human() {

    }

    //Input info
    public void InputHuman(Scanner scanner) {
        System.out.print("Enter your name: ");
        name = scanner.next();
        System.out.print("Enter your year of birth: ");
        yearOfBirth = scanner.nextInt();
    }

    //Output info
    public void OutputHuman() {
        System.out.println("Name: " + name);

        System.out.println("Year of birth: " + yearOfBirth);
    }
}
class Student extends Human {
    private String studentID;
    private double averageScore;


    public Student(String name, int yearOfBirth, String studentID, double averageScore ) {
        super(name, yearOfBirth);
        this.studentID = studentID;
        this.averageScore = averageScore;

    }

    public Student() {
        super();
    }

    public void InputStudent(Scanner scanner) {
        super.InputHuman(scanner);
        System.out.print("Enter student id: ");
        studentID = scanner.next();
        System.out.print("Enter average score: ");
        averageScore = scanner.nextDouble();

    }


    public void OutputStudent() {
        super.OutputHuman();
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Score: " + averageScore);
    }

    public String getStudentID() {
        return studentID;
    }
    public String getName() {
        return name;
    }

    public void findStudent(Student[] students, Scanner scanner, int numberOfStudents) {
        System.out.println("Enter student name or student ID: ");
        String keyword = scanner.next();
        boolean found = false;
        for (int i = 0; i < numberOfStudents; i++) {
            if (students[i].getName().equals(keyword) || students[i].getStudentID().equals(keyword)) {
                students[i].OutputStudent();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Not Found!");
        }
    }
}

class StudentController {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of student: ");
        int numberOfStudents = scanner.nextInt();

        Student[] students = new Student[numberOfStudents];

        //input
        for (int i = 0; i < numberOfStudents; i++) {
            students[i] = new Student();
            students[i].InputStudent(scanner);
        }

        //output
        for (int i = 0; i < numberOfStudents; i++) {
            students[i].OutputStudent();
        }

        //find student
        for (int i = 0; i < numberOfStudents; i++) {
            students[i].findStudent(students, scanner, numberOfStudents);
        }
        scanner.close();
    }
}


