package HW.chapter02;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter investment amount: ");
        double investmentAmount = scanner.nextDouble();

        System.out.println("Enter annual interest rate in percentage: ");
        double monthlyInterestRate = scanner.nextDouble() / 1200;

        System.out.println("Enter number of years: ");
        double years = scanner.nextDouble();

        double accumulatedValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12);

        System.out.println("Accumulated value is $" + accumulatedValue);

    }
}