package HW.chapter01;

public class Q10 {
    public static void main(String[] args) {
        double distance = 14;

        double duration = 45.5/60;
        double speed = distance / duration;
        double speed_in_miles = speed / 1.60934;

        System.out.println(speed_in_miles);

    }
}
