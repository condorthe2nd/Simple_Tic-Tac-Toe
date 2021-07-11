import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) { //iterate over rows
            for (int j = 0; j < n; j++) { //iterate over columns
                array[i][j] = Math.abs(j - i); //calculate cell's value
            }
        }

        for (int[] row : array) {
            System.out.println();
            for (int a : row) {
                System.out.print(a + " ");
            }
        }
    }
}
