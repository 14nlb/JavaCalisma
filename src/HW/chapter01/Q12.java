package HW.chapter01;

public class Q12 {
    public static void main(String[] args) {
        double lengmil = 24;

        double lengkm = lengmil * 1.6;

        int hours = (60 * 60 + 40 * 60 + 35) / 60;

        double speed = lengkm / hours;

        System.out.println("The runner's speed is " + speed + " km/h");
    }
}
