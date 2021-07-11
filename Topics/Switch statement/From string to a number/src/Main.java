import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        int b;
        switch (a) {
            case "one":
                b = 1;
                break;
            case "two":
                b = 2;
                break;
            case "three":
                b = 3;
                break;
            case "four":
                b = 4;
                break;
            case "five":
                b = 5;
                break;
            case "six":
                b = 6;
                break;
            case "seven":
                b = 7;
                break;
            case "eight":
                b = 8;
                break;
            case "nine":
                b = 9;
                break;
            default:
                b = 0;
        }
        System.out.println(b);
    }
}
