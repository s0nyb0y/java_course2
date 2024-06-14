package lesson51_multithreading;

public class Test3 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Test3 test3 = new Test3();
        test3.start();

        for (int i = 1000; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
