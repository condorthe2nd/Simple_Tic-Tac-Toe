package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cells: ");
        String board = scan.nextLine();
        System.out.println("---------");
        System.out.println("| " + board.charAt(0) + " " + board.charAt(1) + " " + board.charAt(2) + " |");
        System.out.println("| " + board.charAt(3) + " " + board.charAt(4) + " " + board.charAt(5) + " |");
        System.out.println("| " + board.charAt(6) + " " + board.charAt(7) + " " + board.charAt(8) + " |");
        System.out.println("---------");
    }
}
