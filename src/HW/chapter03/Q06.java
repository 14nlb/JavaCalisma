package HW.chapter03;

import java.util.Scanner;

public class Q06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double kg = scanner.nextDouble() * .4536;

        System.out.println("Enter feet: ");
        double feet_part_in_meters = scanner.nextDouble() * .3048;

        System.out.println("Enter inches: ");
        double total_meters = feet_part_in_meters + scanner.nextDouble() * .0254;

        double BMI = kg / Math.pow(total_meters, 2);
        System.out.println("BMI is " + BMI);

        if (BMI < 18.5){
            System.out.println("Underweight");
        }

        else if (BMI < 25.) {
            System.out.println("Normal");
        }

        else if (BMI < 30.) {
            System.out.println("Overweight");
        }

        else System.out.println("Obese");
    }
}
