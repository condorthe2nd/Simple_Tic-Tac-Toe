package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int counter = 1;
        char[][] fields = new char[3][3];
        makeBoard(fields);
        printBoard(fields);
        play(fields, scan, counter);


    }


    public static void getResult(char[][] fields) {
        boolean draw = false;
        //boolean impossible = false;
        // Counting total X's and O's
        int xTotal = 0;
        int oTotal = 0;
        for (char[] chars : fields) {
            for (char aChar : chars) {
                if (aChar == 'X') {
                    xTotal += 1;
                }
                if (aChar == 'O') {
                    oTotal += 1;
                }
            }
        }

        // Calculating if someone won somehow
        boolean xWins =
                fields[0][0] + fields[0][1] + fields[0][2] == 264 ||
                        fields[1][0] + fields[1][1] + fields[1][2] == 264 ||
                        fields[2][0] + fields[2][1] + fields[2][2] == 264 ||
                        fields[0][0] + fields[1][0] + fields[2][0] == 264 ||
                        fields[0][1] + fields[1][1] + fields[2][1] == 264 ||
                        fields[0][2] + fields[1][2] + fields[2][2] == 264 ||
                        fields[0][0] + fields[1][1] + fields[2][2] == 264 ||
                        fields[2][0] + fields[1][1] + fields[0][2] == 264;
        boolean oWins =
                fields[0][0] + fields[0][1] + fields[0][2] == 237 ||
                        fields[1][0] + fields[1][1] + fields[1][2] == 237 ||
                        fields[2][0] + fields[2][1] + fields[2][2] == 237 ||
                        fields[0][0] + fields[1][0] + fields[2][0] == 237 ||
                        fields[0][1] + fields[1][1] + fields[2][1] == 237 ||
                        fields[0][2] + fields[1][2] + fields[2][2] == 237 ||
                        fields[0][0] + fields[1][1] + fields[2][2] == 237 ||
                        fields[2][0] + fields[1][1] + fields[0][2] == 237;


        /* Calculating if the match is impossible or drawn and printing it to console
        /*if (Math.abs(xTotal - oTotal) > 1 || oWins && xWins) {
            impossible = true;
            System.out.println("Impossible");
        } else */
        if (Math.abs(xTotal + oTotal) == 9 && !oWins && !xWins) {
            draw = true;
            System.out.println("Draw");
        }

        // If game is neither drawn nor impossible, checking if it is won and printing it to console
        if (!draw) {
            if (xWins) {
                System.out.println("X wins");
            }
            if (oWins) {
                System.out.println("O wins");
            }
        }

        // If nothing happened yet, checking if the game is not finished and printing it to console
        if (!draw && !xWins && !oWins) {
            for (char[] field : fields) {
                for (char c : field) {
                    if (c == '_') {
                        break;
                    }
                }
            }
        }
    }


    public static void printBoard(char[][] fields) {
        System.out.println("---------");
        System.out.printf("| %s %s %s |\n", fields[0][0], fields[0][1], fields[0][2]);
        System.out.printf("| %s %s %s |\n", fields[1][0], fields[1][1], fields[1][2]);
        System.out.printf("| %s %s %s |\n", fields[2][0], fields[2][1], fields[2][2]);
        System.out.println("---------");

    }

    public static void makeMove(char[][] fields, Scanner scan, int counter) {

        while (true) {

            System.out.println("Enter the coordinates: ");
            int coordA = 0;
            int coordB = 0;
            try {
                String[] pieces = scan.nextLine().split("");
                coordA = Integer.parseInt(pieces[0]);
                coordB = Integer.parseInt(pieces[1]);
                System.out.println(coordA);
                System.out.println(coordB);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
            }

            if ((coordA > 3 || coordA < 1) || (coordB > 3 || coordB < 1)) {
                System.out.println("Coordinates should be from 1 to 3!");
            } else if ((fields[coordA - 1][coordB - 1] == 'X') || (fields[coordA - 1][coordB - 1] == 'O')) {
                System.out.println("This cell is occupied! Choose another one!");
            } else {
                if (counter % 2 == 0)
                    fields[coordA - 1][coordB - 1] = 'O';
                else fields[coordA - 1][coordB - 1] = 'X';

                printBoard(fields);
                break;
            }
        }

    }

    public static void makeBoard(char[][] fields) {
        int counter = 0;
        for (int i = 0; i < fields.length; i++) {
            for (int j = 0; j < fields[i].length; j++) {
                fields[i][j] = '_';
                counter++;

            }
        }
    }

    public static void play(char[][] fields, Scanner scan, int counter) {
        while (true) {
            makeMove(fields, scan, counter);
            counter++;
            getResult(fields);

        }
    }
}
