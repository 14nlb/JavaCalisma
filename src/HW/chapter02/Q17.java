package HW.chapter02;

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = scanner.nextDouble();

        System.out.println("Enter the wind speed (>=2) in miles per hour: ");
        double speed = scanner.nextDouble();

        double wci = 35.74 + 0.6215 * temp - 35.75 * Math.pow(speed, 0.16) + 0.4275 * temp * Math.pow(speed, 0.16);

        System.out.println("he wind chill index is " + wci);
    }
}
