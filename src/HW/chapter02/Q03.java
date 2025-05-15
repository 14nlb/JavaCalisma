package HW.chapter02;

import java.util.Scanner;

public class Q03 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.println("Enter a value for feet: ");
        double feet = input1.nextDouble();

        double meter = feet * 0.305;

        System.out.println(feet + " feet is " + meter + " meters");
    }
}
