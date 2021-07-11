import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String digits = scan.nextLine();
        String[] hi = digits.split("");
        List<Integer> num = new ArrayList<>();
        for (String i : hi) {
            num.add(Integer.parseInt(i));
        }
        int a = num.get(0) + num.get(1) + num.get(2);
        int b = num.get(3) + num.get(4) + num.get(5);
        if (a == b) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}
