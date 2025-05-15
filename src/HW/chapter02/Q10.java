package HW.chapter02;
import java.util.Scanner;

public class Q10 {
     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the amount of water in kilograms: ");
         double kg = scanner.nextDouble();
         System.out.println("Enter the initial temperature: ");
         double inittemp = scanner.nextDouble();
         System.out.println("Enter the final temperature: ");
         double finaltemp = scanner.nextDouble();

         /*double kg = scanner.nextDouble();
          double inittemp = scanner.nextDouble();
          double finaltemp = scanner.nextDouble(); */

         double Q = kg * (finaltemp - inittemp) * 4184;

         System.out.println("The energy needed is " + Q);

     }
}

