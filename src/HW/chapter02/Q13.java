package HW.chapter02;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the monthly saving amount: ");
        double amount = scanner.nextDouble();


        double month1 = amount * (1 + 0.00417);
        double month2 = (amount + month1) * (1 + 0.00417);
        double month3 = (amount + month2) * (1 + 0.00417);
        double month4 = (amount + month3) * (1 + 0.00417);
        double month5 = (amount + month4) * (1 + 0.00417);
        double month6 = (amount + month5) * (1 + 0.00417);

        System.out.println("After the sixth month, the account value is $" + month6);




    }
}
