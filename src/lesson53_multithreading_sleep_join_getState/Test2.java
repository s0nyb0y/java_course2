package lesson53_multithreading_sleep_join_getState;

public class Test2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable());
        thread1.start();
        Test2 test2 = new Test2();
        test2.start();

        // метод .join() приостанавливает выполнение метода main, пока не доработают потоки
        test2.join();
        thread1.join();
        System.out.println("The End !!!");
    }
}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}