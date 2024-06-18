package lesson54_multithreading_volatile;

public class Test extends Thread{
    // ключевое слово volatile не позволяет записать значение переменной в кэш память
    volatile boolean b = true;
    long counter = 0;
    @Override
    public void run() {
        while (b){
            counter++;
        }
        System.out.println("Method finished. Counter = " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        Test thread = new Test();
        thread.start();
        Thread.sleep(3000);
        System.out.println("After 3 seconds it is time to wake up");
        thread.b = false;
        thread.join();
        System.out.println("End of program");
    }
}