import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        double a, b, c;
        if (type.equalsIgnoreCase("triangle")) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            c = scanner.nextDouble();
            double p = (a + b + c) / 2;
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            //System.out.printf("%.2f",area);
            System.out.println(area);
        } else if (type.equalsIgnoreCase("rectangle")) {
            a = scanner.nextDouble();
            b = scanner.nextDouble();
            System.out.println(a * b);
        } else {
            if (type.equalsIgnoreCase("circle")) {
                a = scanner.nextDouble();
                System.out.println((a * a) * 3.14);
            }
        }
    }
}
