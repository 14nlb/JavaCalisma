package HW.chapter02;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius and length of a cylinder: ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = Math.pow(radius, 2) * Math.PI;
        double volume = area * length;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + volume);
    }
}
