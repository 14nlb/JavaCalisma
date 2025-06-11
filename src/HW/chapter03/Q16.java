package HW.chapter03;

import java.util.Random;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {

        Random random = new Random();

        double width = 100;
        double heieght = 200;

        double randomx = -50 + random.nextDouble() * 100;
        double randomy = -100 + random.nextDouble() * 200;

        System.out.println("A random coordinate in the rectangle : (" + randomx + ", " + randomy);


    }
}
