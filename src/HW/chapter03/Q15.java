package HW.chapter03;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your lottery pick (two digits): ");

        int chosennum = scanner.nextInt();

        int chosenseconddigit = chosennum % 10;
        int chosenfirstdigit = chosennum / 10;

        int lotternum = (int) (Math.random() * 100);
        int lottseconddigit = lotternum % 10;
        int lottfirstdigit = lotternum / 10;

        if (chosenfirstdigit == lottfirstdigit && chosenseconddigit == chosenseconddigit){
            System.out.println("Your prize is $10.000.");
        }
        else if ((chosenfirstdigit == lottfirstdigit || chosenfirstdigit == lottseconddigit) && (chosenseconddigit == lottfirstdigit || chosenseconddigit == lottseconddigit)) {
            System.out.println("Your prize is $3.000.");
        }
        else if (chosenfirstdigit == lottfirstdigit || chosenseconddigit == lottseconddigit || chosenfirstdigit == lottseconddigit || chosenseconddigit == lottfirstdigit){
            System.out.println("Your prize is $1.000.");
        }
        else {
            System.out.println("You didn't get a prize.");

        }

    }
}
