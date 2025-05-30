package HW.chapter03;

import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 3 digit number: ");

        int number = scanner.nextInt();

        int lastdigit = number % 10;
        int firstdigit = number / 100;

        if (firstdigit == lastdigit) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
