package HW.chapter03;

import java.util.Scanner;


public class Q01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double r1 = (-b + Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);
        double r2 = (-b - Math.pow(Math.pow(b, 2) - (4 * a * c), 0.5)) / (2 * a);

        if (Math.pow(b, 2) - 4 * a * c > 0) {
            System.out.print("The equation has two roots " + r1 + " and " + r2);
        }
        else if (Math.pow(b, 2) - 4 * a * c == 0){
            System.out.print("The equation has two roots " + r1);
        }
        else {
            System.out.println("The equation has no real roots");
        }

    }
}

