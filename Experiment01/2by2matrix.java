// Problem 5:
// Implement a Java program to perform 2×2 matrix multiplication,
// addition, and transpose (using switch case).

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int result[][] = new int[2][2];

        System.out.println("Enter Matrix A:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter Matrix B:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                b[i][j] = sc.nextInt();

        System.out.println("1.Addition 2.Multiplication 3.Transpose");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                for(int i=0;i<2;i++)
                    for(int j=0;j<2;j++)
                        result[i][j] = a[i][j] + b[i][j];
                break;

            case 2:
                for(int i=0;i<2;i++)
                    for(int j=0;j<2;j++)
                        for(int k=0;k<2;k++)
                            result[i][j] += a[i][k] * b[k][j];
                break;

            case 3:
                for(int i=0;i<2;i++)
                    for(int j=0;j<2;j++)
                        result[i][j] = a[j][i];
                break;
        }

        System.out.println("Result:");
        for(int i=0;i<2;i++) {
            for(int j=0;j<2;j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}