import java.util.Arrays;
import java.util.Scanner;

public class PrintDiagonalsOfSquareMatrix_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[][] matrix = new int[n][n];

        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        }


        for (int index = 0; index < n; index++) {
            System.out.print(matrix[index][index] + " ");
        }
        System.out.println();

        int row = n - 1;
        int col = 0;
        while (row >= 0 && row < n && col >= 0 && col < n){
            System.out.print(matrix[row][col] + " ");
            row--;
            col++;
        }

    }
}
