package HW.chapter01;

public class Q13 {
    public static void main(String[] args) {

        double a = 3.4;
        double b = 50.2;
        double c = 2.1;
        double d = .55;
        double e = 44.5;
        double f = 5.9;

        double x = (e * d - b * f) / (a * d - b * c);
        double y = (a * f - e * c) / (a * d - b * c);

        System.out.println("The value of x is: " + x);
        System.out.print("The value of y is: " + y);

    }
}
