package HW.chapter02;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");

        double balance = scanner.nextDouble();
        double intrat = scanner.nextDouble();
        double interest = balance * intrat / 1200;

        System.out.println("The interest is " + interest);

    }
}
