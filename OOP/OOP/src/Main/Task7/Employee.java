package Main.Task7;

import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    protected String employeeID;
    protected String name;
    protected int yearOfBirth;

    public void Input(Scanner sc) {
        sc.nextLine(); // Loại bỏ dòng thừa
        System.out.print("Nhập mã nhân viên: ");
        employeeID = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.print("Nhập năm sinh: ");
        yearOfBirth = sc.nextInt();
    }

    public void Output() {
        System.out.println("Mã nhân viên: " + employeeID);
        System.out.println("Họ tên: " + name);
        System.out.println("Năm sinh: " + yearOfBirth);
    }
}

class Officer extends Employee {
    private double luongCoBan;
    private double heSoLuong;
    private double tienLuong;

    public void nhap(Scanner sc) {
        super.Input(sc); // Gọi phương thức nhập của lớp cha
        System.out.print("Nhập lương cơ bản: ");
        luongCoBan = sc.nextDouble();
        System.out.print("Nhập hệ số lương: ");
        heSoLuong = sc.nextDouble();
    }

    public void tinhLuong() {
        tienLuong = luongCoBan * heSoLuong;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    @Override
    public void Output() {
        super.Output();
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Tiền lương: " + tienLuong);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập số lượng cán bộ: ");
        int n = sc.nextInt();

        Officer[] danhSach = new Officer[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cán bộ thứ " + (i + 1) + ":");
            danhSach[i] = new Officer();
            danhSach[i].nhap(sc);
            danhSach[i].tinhLuong();
        }
        //sapxep luong theo giam dan
        Arrays.sort();


    }
}
