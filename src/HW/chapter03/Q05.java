package HW.chapter03;
import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter today's day: ");
        int todays_day_num = scanner.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int elapsed_day_num = scanner.nextInt();

        String todays_day_name;
        String elapsed_day_name;

        if (todays_day_num == 0) todays_day_name = "Sunday";
        else if (todays_day_num == 1) todays_day_name = "Monday";
        else if (todays_day_num == 2) todays_day_name = "Tuesday";
        else if (todays_day_num == 3) todays_day_name = "Wednesday";
        else if (todays_day_num == 4) todays_day_name = "Thursday";
        else if (todays_day_num == 5) todays_day_name = "Friday";
        else if (todays_day_num == 6) todays_day_name = "Saturday";
        else todays_day_name = "invalid";


        if ((todays_day_num + elapsed_day_num) % 7 == 0) elapsed_day_name = "Sunday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 1) elapsed_day_name = "Monday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 2) elapsed_day_name = "Tuesday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 3) elapsed_day_name = "Wednesday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 4) elapsed_day_name = "Thursday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 5) elapsed_day_name = "Friday";
        else if ((todays_day_num + elapsed_day_num) % 7 == 6) elapsed_day_name = "Saturday";
        else elapsed_day_name = "invalid";

        System.out.print("Today is " + todays_day_name + " and the future day is " + elapsed_day_name);

    }
}
