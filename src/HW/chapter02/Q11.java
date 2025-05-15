package HW.chapter02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        int pop = 312032486;
        int year_in_secs = 365 * 24 * 60 * 60;

        int births = year_in_secs / 7;
        int deaths = year_in_secs / 13;
        int immigrants = year_in_secs / 45;

        int change = births + immigrants - deaths;
        int res = pop + change * years;

        System.out.println("The population in 5 years is " + res);


    }
}
