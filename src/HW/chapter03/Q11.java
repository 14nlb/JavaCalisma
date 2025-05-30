package HW.chapter03;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the month and the year: ");
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        if (month == 1) {
            System.out.println("The month is " + "January" + " and has " + "31" + " days.");
        }

        else if (month == 2) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                System.out.println("The month is " + "February" + " and has " + "29" + " days.");
            } else {
                System.out.println("The month is " + "February" + " and has " + "28" + " days.");
            }
        }
        else if (month == 3) {
            System.out.println("The month is " + "March" + " and has " + "31" + " days.");
        }
        else if (month == 4) {
            System.out.println("The month is " + "April" + " and has " + "30" + " days.");
        }
        else if (month == 5) {
            System.out.println("The month is " + "May" + " and has " + "31" + " days.");
        }
        else if (month == 6) {
            System.out.println("The month is " + "June" + " and has " + "30" + " days.");
        }
        else if (month == 7) {
            System.out.println("The month is " + "July" + " and has " + "31" + " days.");
        }
        else if (month == 8) {
            System.out.println("The month is " + "August" + " and has " + "31" + " days.");
        }
        else if (month == 9) {
            System.out.println("The month is " + "September" + " and has " + "30" + " days.");
        }
        else if (month == 10) {
            System.out.println("The month is " + "October" + " and has " + "31" + " days.");
        }
        else if (month == 11) {
            System.out.println("The month is " + "November" + " and has " + "30" + " days.");
        }
        else if (month == 12) {
            System.out.println("The month is " + "December" + " and has " + "31" + " days.");
        }
    }
}
