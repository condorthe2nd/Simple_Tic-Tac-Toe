import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String original = scan.nextLine();
        String[] s = original.split("-");
        System.out.println(s[1] + "/" + s[2] + "/" + s[0]);
    }
}