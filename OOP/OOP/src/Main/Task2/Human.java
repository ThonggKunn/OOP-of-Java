package Main.Task2;

import java.util.Arrays;
import java.util.Comparator;
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
        scanner.nextLine();
    }

    public void OutputStudent() {
        super.OutputHuman();
        System.out.println("Student ID: " + studentID);
        System.out.println("Average Score: " + averageScore);
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

//    public static void Arrange(Student[] students, int numberOfStudents) {
//        Student temp;
//        for (int i = 0; i < numberOfStudents-1; i++) {
//            for (int j = i+1; j < numberOfStudents; j++) {
//                if (students[i].getAverageScore() < students[j].getAverageScore()) {
//                    temp = students[i];
//                    students[i] = students[j];
//                    students[j] = temp;
//                }
//            }
//        }
//    }
}

 class StudentController {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter number of students: ");
         int numberOfStudents = scanner.nextInt();

         Student[] students = new Student[numberOfStudents];
         for (int i = 0; i < numberOfStudents; i++) {
             System.out.println("Enter info of student " + (i + 1) + ":");
             students[i] = new Student();
             students[i].InputStudent(scanner);
         }

         System.out.println("------ Information ------");
         for (int i = 0; i < numberOfStudents; i++) {
             students[i].OutputStudent();
         }

         System.out.println("--------------------------");

         //interface compare 2objs
         Arrays.sort(students, new Comparator<Student>() {
             @Override
             public int compare(Student s1, Student s2) {
                 return Double.compare(s2.getAverageScore(), s1.getAverageScore());
             }
         });
         System.out.println(" ");
         System.out.println("List after arranged: ");
         for (Student student : students) {
             System.out.println(student.getName() + ": " + student.getAverageScore());
         }
     }
}


