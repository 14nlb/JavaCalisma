package HW.chapter02;
import java.util.Scanner;

public class Q10 {
     public static void main (String[] args) {
         Scanner scanner = new Scanner(System.in);

         System.out.println("Enter the amount of water in kilograms: ");
         double kg = scanner.nextDouble();
         System.out.println("Enter the initial temperature: ");
         double initTemp = scanner.nextDouble();
         System.out.println("Enter the final temperature: ");
         double finalTemp = scanner.nextDouble();

         double Q = kg * (finalTemp - initTemp) * 4184;

         System.out.println("The energy needed is " + Q);

     }
}

