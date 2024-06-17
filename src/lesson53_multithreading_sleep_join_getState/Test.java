package lesson53_multithreading_sleep_join_getState;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
            // метод .sleep() приостанавливает поток на заданное время
            Thread.sleep(1000);
        }
        System.out.println("Поехали!!!");
    }
}
