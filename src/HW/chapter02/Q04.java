package HW.chapter02;
import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {

        System.out.println("Enter a number in pounds: ");
        Scanner scanner = new Scanner(System.in);
        double pounds = scanner.nextDouble();

        double kg = pounds * 0.454;
        System.out.println(pounds + "pounds is " + kg + "kg");
    }
}
