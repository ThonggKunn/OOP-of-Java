package Main.Task4;

import java.util.Scanner;

public class SquareMatrix {
    private int level;
    private int[][] Matrix;

    public void Input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the level of the matrix: ");
        level = sc.nextInt();
        Matrix = new int[level][level];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                Matrix[i][j] = sc.nextInt();
            }
        }
    }

    public void Output() {
        System.out.println("Matrix just entered:");
        for (int i = 0; i < level; i++) {
            for (int j = 0; j < level; j++) {
                System.out.print(Matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public int tongCheoChinh() {
        int sum = 0;
        for (int i = 0; i < level; i++) {
            sum += Matrix[i][i];
        }
        return sum;
    }

    public int tongCheoPhu() {
        int sum = 0;
        for (int i = 0; i < level; i++) {
            sum += Matrix[i][level - 1 - i];
        }
        return sum;
    }
}

class Main {
    public static void main(String[] args) {
        SquareMatrix mt = new SquareMatrix();

        mt.Input();

        mt.Output();

        System.out.println("Sum of elements on the main diagonal: " + mt.tongCheoChinh());
        System.out.println("Sum of elements on the extra diagonal: " + mt.tongCheoPhu());
    }
}

