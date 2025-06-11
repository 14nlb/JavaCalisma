package HW.chapter03;

import java.util.Random;
import java.util.Scanner;

public class Q17 {
    public  static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"Scissor", "Rock", "Paper"}; //

        System.out.print("scissor (0), rock (1), paper (2): ");
        int choiceUser = scanner.nextInt();

        if (choiceUser < 0 || choiceUser > 2) {
            System.out.println("Invalid input. Please enter 0, 1, or 2.");
            return;
        }

        String choiceUserString = choices[choiceUser];
        System.out.println("You chose: " + choiceUserString);

        Random rand = new Random();
        int choiceComputer = rand.nextInt(3);
        System.out.println("Computer chose: " + choices[choiceComputer]);
        //Bu sefer arrayden secilecek string icin yeni obje yaratmadim

        if (choiceUser == choiceComputer) {
            System.out.println("It's a draw!");
        }
        else if (choiceUser == 1 && choiceComputer == 3 ||
                choiceUser == 2 && choiceComputer == 1 ||
                choiceUser == 3 && choiceComputer == 2) {
            System.out.println("You win!");
        }
        else System.out.println("You lose!");
    }
}
