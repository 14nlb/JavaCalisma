package HW.chapter02;
import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        System.out.print("Enter the time zone offset to GMT: ");
        Scanner gmt = new Scanner(System.in);
        int offset = gmt.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinutes = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHours = (totalHours + offset) % 24;

        System.out.println("The current time is " + currentHours + ":" + currentMinutes + ":" + currentSecond);

    }
}
