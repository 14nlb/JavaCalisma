package HW.chapter02;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds: ");
        double kg = scanner.nextDouble() *  0.45359237;

        System.out.println("Enter height in inches: ");
        double cm = scanner.nextDouble() * 0.0254;

        double BMI = kg / Math.pow(cm, 2);

        System.out.println("BMI is " + BMI);




    }

}
