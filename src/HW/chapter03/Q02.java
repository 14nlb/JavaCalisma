package HW.chapter03;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() * 3 % 10);
        int number3 = (int)(System.currentTimeMillis() * 12 % 10);


        System.out.print(number1 + " + " + number2 + " + " + number3 + " = ?   ? = ");
        Scanner scanner = new Scanner(System.in);
        int answer = scanner.nextInt();

        System.out.println(number1 + " + " + number2 + " + " + number3 + " = " + answer + " " + (number1 + number2 +
                number3 == answer));
    }
}
