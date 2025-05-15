package HW.chapter02;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter speed and acceleration: ");
        double speed = scanner.nextDouble();
        double accel = scanner.nextDouble();

        double length = Math.pow(speed, 2) / (2 * accel);
        System.out.println("The minimum runway length for this airplane is " + length);

    }

}
