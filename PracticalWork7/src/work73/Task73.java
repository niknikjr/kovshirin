package work73;

import java.util.Scanner;

public class Task73 {
    public static void main(String[] args) {
        System.out.print("Введите размер матрицы --> ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int matrix[][] = createMatrix(size);
        printMatrix(matrix);

    }

    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print("  "+matrix[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] createMatrix (int size) {
        int m=1;
        int matrix[][] = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[j][i] = m;
                m=m+1;
            }
        }
        return matrix;
    }

}
