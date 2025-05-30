package HW.chapter03;

import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Q09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first 9 digits of an ISBN as integer: ");
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();
        int d3 = scanner.nextInt();
        int d4 = scanner.nextInt();
        int d5 = scanner.nextInt();
        int d6 = scanner.nextInt();
        int d7 = scanner.nextInt();
        int d8 = scanner.nextInt();
        int d9 = scanner.nextInt();


        System.out.print(d1) ;
        System.out.print(d2);
        System.out.print(d3);
        System.out.print(d4);
        System.out.print(d5);
        System.out.print(d6);
        System.out.print(d7);
        System.out.print(d8);
        System.out.print(d9);
         if ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 * d7 * 7 + d8 * 8 + d9 * 9) % 11 == 0) {
            System.out.print("X");
        }
         else System.out.println((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 * d7 * 7 + d8 * 8 + d9 * 9) % 11);


    }
}
