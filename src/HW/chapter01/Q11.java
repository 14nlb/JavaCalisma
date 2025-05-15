package HW.chapter01;

public class Q11 {
    public static void main(String[] args) {
        double pop = 312032486;
        double year_in_secs = 365 * 24 * 60 * 60;

        double births = year_in_secs / 7;
        double deaths = year_in_secs / 13;
        double immigrants = year_in_secs / 45;

        double change = births + immigrants - deaths;

        System.out.println("year one: " + (int) (pop + change));
        pop += change;
        System.out.println("year two: " + (int) (pop + change));
        pop += change;
        System.out.println("year three: " + (int) (pop + change));
        pop += change;
        System.out.println("year four: " + (int) (pop + change));
        pop += change;
        System.out.println("year five: " + (int) (pop + change));

    }
}