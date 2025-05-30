package HW.chapter02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
        double balance = scanner.nextDouble();
        double annualInterest = scanner.nextDouble();

        double monthlyInterest = annualInterest / 1200;

        double balanceEndOfMonth = balance * monthlyInterest;

        System.out.println("The balance end of month is " + balanceEndOfMonth);
    }
}