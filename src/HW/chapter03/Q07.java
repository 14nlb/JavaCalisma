package HW.chapter03;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter an amount in double, for example 11.56: ");

        double totalamount = scanner.nextDouble() * 100;

        int one_dollars = (int) (totalamount / 100);
        int rest = (int) totalamount % 100;

        int quarters = rest / 25;
        rest = rest % 25;

        int dimes = rest / 10;
        rest = rest % 10;

        int nickels = rest / 5;
        rest = rest % 5;

        int pennies = rest;

        System.out.println("Your amount " + totalamount + " consists of");
        if (one_dollars > 1 || one_dollars == 0) {
            System.out.println(one_dollars + " dollars");
        }
        else System.out.println(one_dollars + " dollar");

        if (quarters != 1) {
            System.out.println(quarters + " quarters");
        }
        else System.out.println(quarters + " quarter");

        if (dimes != 1) {
            System.out.println(dimes + " dimes");
        }
        else System.out.println(dimes + " dime");

        if (nickels != 1) {
            System.out.println(nickels + " nickels");
        }
        else System.out.println(nickels + " nickel");

        if (pennies != 1) {
            System.out.println(pennies + " pennies");
        }
        else System.out.println(pennies + " penny");
    }
}
