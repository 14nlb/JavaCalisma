package HW.chapter02;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the input as an integer whose last two digits represent the cents.\n" +
                "For example, the input 1156 represents 11 dollars and 56 cents: ");
        int number = scanner.nextInt();

        int lastdigit = number % 10;
        number = number / 10;

        int seclastdigit = number % 10;
        number = number / 10;

        System.out.println("The value in dollars is: $" + number + "." + seclastdigit + lastdigit);
    }
}
