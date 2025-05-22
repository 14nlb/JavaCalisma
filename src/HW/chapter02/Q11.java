package HW.chapter02;

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of years: ");
        int years = scanner.nextInt();

        int pop = 312032486;
        double year_in_secs = 365 * 24 * 60 * 60;

        double births = year_in_secs / 7;
        double deaths = year_in_secs / 13;
        double immigrants = year_in_secs / 45;

        double change = births + immigrants - deaths;
        double res = pop + change * years;

        System.out.println("The population in 5 years is " + (int) res);
    }
}
