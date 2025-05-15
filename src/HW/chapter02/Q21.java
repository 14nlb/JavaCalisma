package HW.chapter02;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double invam = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double montintrat = scanner.nextDouble() / 1200;

        System.out.println("Enter number of years: ");
        double yrs = scanner.nextDouble();

        double futinv = invam * Math.pow((1 + montintrat), yrs * 12);

        System.out.println("Accumulated value is $" + futinv);

    }
}