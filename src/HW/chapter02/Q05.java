package HW.chapter02;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner (System.in);
        System.out.println("Enter the subtotal and a gratuity rate: ");
        double subtotal = scanner.nextDouble();
        double grate = scanner1.nextDouble();

        double gratuity_rate = subtotal * grate /100;
        double total = subtotal + gratuity_rate;
        System.out.println("The gratuity is $" + gratuity_rate + " and total is $" + total);



    }

}
