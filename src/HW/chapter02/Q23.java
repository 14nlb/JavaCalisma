package HW.chapter02;

import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        System.out.println("Enter miles per gallon: ");
        double mpg = scanner.nextDouble();

        System.out.println("Enter price per gallon: ");
        double ppg = scanner.nextDouble();

        double cost = distance / mpg * ppg;

        System.out.println("The cost of driving is " + cost);
    }
}
