package HW.chapter02;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        System.out.println("Enter the number of minutes: ");
        Scanner scanner = new Scanner(System.in);

        int mins = scanner.nextInt();
        int approxYears = mins / 60 / 24 / 365;
        int approxHours = (mins - (approxYears * 60 * 24 * 365)) / 60;

        System.out.println(mins + " minutes is approximately " + approxYears + " years and " + approxHours + " hours");

    }
}
