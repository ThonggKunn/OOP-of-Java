package Main.Task5;

import java.util.Scanner;

public class Matrix {
    private int rowNumber;
    private int columnNumber;
    private int[][] Matrix;

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row : ");
        rowNumber = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        columnNumber = sc.nextInt();

        Matrix = new int[rowNumber][columnNumber];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                Matrix[i][j] = sc.nextInt();
            }
        }
    }
    public void Output() {
        System.out.println("Matrix just entered:");
        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public int tongDuongVien() {
        int sum = 0;

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < columnNumber; j++) {
                if (i == 0 || i == rowNumber - 1 || j == 0 || j == columnNumber - 1) {
                    sum += Matrix[i][j];
                }
            }
        }
        return sum;
    }
}
class Main {
    public static void main(String[] args) {
        Matrix mt = new Matrix();

        mt.Input();

        mt.Output();

        System.out.println("Sum of elements on the 4 borders of the matrix: " + mt.tongDuongVien());
    }
}
