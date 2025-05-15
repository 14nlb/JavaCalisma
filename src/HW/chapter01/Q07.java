package HW.chapter01;

public class Q07 {
    public static void main(String[] args) {
        double piApproximation6Terms = 4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0);

        // Calculate π with 7 terms (adding + 1/13)
        double piApproximation7Terms = 4.0 * (1.0 - 1.0 / 3.0 + 1.0 / 5.0 - 1.0 / 7.0 + 1.0 / 9.0 - 1.0 / 11.0 + 1.0 / 13.0);

        // Display results
        System.out.println("Approximation with 6 terms: " + piApproximation6Terms);
        System.out.println("Approximation with 7 terms: " + piApproximation7Terms);
    }
}
