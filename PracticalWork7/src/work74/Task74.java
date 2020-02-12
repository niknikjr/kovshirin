package work74;

public class Task74 {
    public static void main(String[] args) {
        int [][] matrix = createMatrix(3);
        printMatrix(matrix);
        transpositionMatrix(matrix);
        System.out.println("----------------------------");
        printMatrix(matrix);
    }

    public static int[][] createMatrix (int size){
        if (size<=0){
            return null;
        }
        int [][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int)(Math.random()*100) -50;
            }
                    }
        return arr;
    }

    public static void printMatrix(int[][] matrix){
        for (int[] row : matrix){
            System.out.print("[ ");
            for (int elem:row){
                System.out.print("" + elem + "");
            }
            System.out.print(" ]");
            System.out.println();
        }
    }

    public static void transpositionMatrix(int[][] matrix){
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
                    }
    }
}
