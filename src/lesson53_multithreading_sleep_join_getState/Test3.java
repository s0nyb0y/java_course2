package lesson53_multithreading_sleep_join_getState;

public class Test3 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Worker());
        // метод .getState() возвращает состояние потока
        System.out.println(thread.getState());
        thread.start();
        System.out.println(thread.getState());
        // метод .join(4000) с параметрами приостанавливает main на указанное время, но если потоки заканчивают свою работу
        // раньше, то тогда main продолжает свою работу сразу, не дожидаясь конца времени, указанного в параметрах
        thread.join(4000);
        System.out.println(thread.getState());
        System.out.println("Method main ends");
    }
}
class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}