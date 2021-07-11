import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int a = scan.nextInt();
        if (s.length() < a || a == 0) {
            System.out.println(s);
        } else {
            String change = s.substring(0, a);
            String stay = s.substring(a);

            /* really cool but completely wrong method i wrote
            char[] result = new char[change.length()];

            for (int i = 0; i < change.length(); i++) {
                result[change.length() - i - 1] = chang[i];
            }
            change = String.valueOf(result);*/
            System.out.println(stay + change);
        }

    }
}