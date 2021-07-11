import java.util.Arrays;
import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        char[][] a = new char[size][size];
        for (char[] row : a) {
            Arrays.fill(row, '.');
        }
        int k = size / 2;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    a[i][j] = '*';
                }
                if (j == k) {
                    a[i][j] = '*';
                }
                if (i == k) {
                    a[i][j] = '*';
                }
                if (i + j) == (size - 1) {
                    a[i][j] = '*';
                }
            }
        }
        System.out.println("");
        for (char[] row : a) {
            System.out.println();
            for (char g : row) {
                System.out.print(g + " ");
            }
        }
    }
}
