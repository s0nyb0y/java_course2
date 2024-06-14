package lesson51_multithreading;

public class Test5 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 1000; i++) {
                    System.out.println(i);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 1000; i >= 1; i--) {
                System.out.println(i);
            }
        }).start();
    }
}
