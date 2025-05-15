package threads;

public class SimpleThreads {
    public static void main(String[] args) {
        new Thread(() -> print100Times("thread1")).start();
        new Thread(() -> print100Times("thread2")).start();

        print100Times("main");
    }

    private static void print100Times(String message) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i + " " + message);
        }
    }
}
