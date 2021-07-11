import java.util.Scanner;

import static java.util.Arrays.deepToString;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }
        for (int[] row : matrix) {
            System.out.println();
            for (int a : row) {
                System.out.print(a + " ");
            }
        }
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int temp;
        for (int i = 0; i < n; i++) {
            temp = matrix[(num1)][i];
            matrix[num1][i] = matrix[num2][i];
            matrix[num2][i] = temp;

        }
        for (int[] row : matrix) {
            System.out.println();
            for (int a : row) {
                System.out.print(a + " ");
            }
        }
    }
}