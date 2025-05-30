package HW.chapter03;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 3 integers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        if (number1 <= number2 && number2 <= number3) {
            System.out.print(number1 + " " + number2 + " " + number3);
        }

        else if (number1 <= number3 && number3 <= number2) {
            System.out.print(number1 + " " + number3 + " " + number2);
        }

        else if (number2 <= number1 && number1 <= number3) {
            System.out.print(number2 + " " + number1 + " " + number3);
        }

        else if (number2 <= number3 && number3 <= number1) {
            System.out.print(number2 + " " + number3 + " " + number1);
        }

        else if (number3 <= number1 && number1 <= number2) {
            System.out.print(number3 + " " + number1 + " " + number2);
        }
        else  System.out.print(number3 + " " + number2 + " " + number1);


    }
}
