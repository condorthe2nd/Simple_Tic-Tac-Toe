import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.fill;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        char[][] a = new char[size][size];
        for (char[] row : a) {
            Arrays.fill(row, '.');
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {

                // Condition for secondary diagonal
                if ((i + j) == (size - 1)) {
                    a[i][j] = '*';
                }
            }
        }
        System.out.println("");
        for(char [] row:a){
            System.out.println();
            for(char g:row){
                System.out.print(g + " ");
            }
        }
    }
}