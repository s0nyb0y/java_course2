package lesson51_multithreading;

public class Test4 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Test4());
        thread1.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
