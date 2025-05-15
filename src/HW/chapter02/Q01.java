package HW.chapter02;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for Celsius value:");
        double celsius = input.nextDouble();

        double fahrenheit = celsius * 9./5 + 32;

        System.out.println("The Fahrenheit Value of " + celsius + " Celsius degrees is " + fahrenheit + " Fahrenheit.");
    }
}
