import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [][] matrix = getMatrix();
        List<Integer[]> zeroLocations = new ArrayList<>();
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j< matrix[0].length;j++){
                if(matrix[i][j]==0){
                    Integer[] location = {i, j};
                    zeroLocations.add(location);
                }
            }
        }
        updateZeros(zeroLocations,matrix);
    }

    private static void updateZeros(List<Integer[]> zeroLocations,int[][] matrix) {
        for (Integer[] location: zeroLocations) {
            for (int temp_row=0;temp_row< matrix.length;temp_row++){
                matrix[temp_row][location[1]]=0;
            }

            for (int temp_col=0;temp_col< matrix[0].length;temp_col++){
                matrix[location[0]][temp_col]=0;
            }
        }
        printMatrixString(matrix);
        printMatrix(matrix);

    }

    private static void printMatrixString(int[][] matrix) {
        StringBuilder matrixString = new StringBuilder("[");
        for (int i = 0; i < matrix.length; i++) {
            matrixString.append("[");
            for (int j = 0; j < matrix[i].length; j++) {
                matrixString.append(matrix[i][j]);
                if (j != matrix[i].length - 1) {
                    matrixString.append(",");
                }
            }
            matrixString.append("]");
            if (i != matrix.length - 1) {
                matrixString.append(",");
            }
        }
        matrixString.append("]");

        System.out.println(matrixString);
    }

    private static void printMatrix(int[][] arr) {
        for (int[] ints : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    private static int[][] getMatrix() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        System.out.println("Enter the elements of the array:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        return arr;
    }


}