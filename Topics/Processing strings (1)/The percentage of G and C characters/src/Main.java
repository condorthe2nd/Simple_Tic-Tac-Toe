import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cg = scan.nextLine().toLowerCase();
        double a = 0;
        for (int i = 0; i < cg.length(); i++) {
            if (cg.charAt(i) == 'g' || cg.charAt(i) == 'c') {
                a++;
            }
        }
        double result = (double) a / cg.length() * 100;
        System.out.println(result);
    }
}
