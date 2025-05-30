package HW.chapter03;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a guess (0 = head 1 = tail): ");
        int guess = scanner.nextInt();

        int realanswer = (int) (Math.random() * 10) % 2;

        if (guess == realanswer) {
            System.out.println("Your answer is correct");
        } else {
            System.out.println("Your answer is wrong");
        }
    }
}
