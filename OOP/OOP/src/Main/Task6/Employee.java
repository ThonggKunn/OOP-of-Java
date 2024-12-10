package Main.Task6;

import java.util.Scanner;

public class Employee {
    private String name;
    private String position;
    private String gender;
    private int yearOfBirth;
    private String hometown;
    private int yearBegin;


    public void Input(Scanner sc) {
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter position: ");
        position = sc.nextLine();
        System.out.print("Enter gender: ");
        gender = sc.nextLine();
        System.out.print("Enter year of birth: ");
        yearOfBirth = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter hometown: ");
        hometown = sc.nextLine();
        System.out.print("Enter year begin: ");
        yearBegin = sc.nextInt();
    }

    public void Output() {
        System.out.println("Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Gender: " + gender);
        System.out.println("Year of birth: " + yearOfBirth);
        System.out.println("Hometown: " + hometown);
        System.out.println("Year of start job: " + yearBegin);
    }

    public int lamViecTren20Nam(int yearCurrent) {
        return yearCurrent - yearBegin;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter employee information " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].Input(sc);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Employee information " + (i + 1) + ":");
            employees[i].Output();
        }
        int yearCurrent = java.time.Year.now().getValue();

        System.out.println("\nDanh sách nhân viên làm việc trên 20 năm:");
        for (int i = 0; i < n; i++) {
            if (employees[i].lamViecTren20Nam(yearCurrent) > 20) {
                employees[i].Output();
            }
        }
        sc.close();
    }
}