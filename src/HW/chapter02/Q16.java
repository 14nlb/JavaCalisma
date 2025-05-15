package HW.chapter02;

import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side: ");

        double s = scanner.nextDouble();
        double area = ((3 * Math.pow(3, 0.5)) / 2) * Math.pow(s, 2);

        System.out.println("The area of the hexagon is " + area);

    }
}
