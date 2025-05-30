package HW.chapter03;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        System.out.println("What is " + number1 + " + " + number2 + "?");
        int answer = scanner.nextInt();

        if (answer == number1 + number2) {
            System.out.println("Your answer is correct!");

        }

        else {
            System.out.println("Your answer is wrong.");
            System.out.println("The right answer is " + number1 + number2 + ".");
        }


    }
}
