package lesson57_multithreading_wait_notify;

public class WaitNotifyEx2 {
    public static void main(String[] args) {
        Market2 market = new Market2();
        Producer2 producer = new Producer2(market);
        Consumer2 consumer = new Consumer2(market);
        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);
        thread1.start();
        thread2.start();
    }
}

class Market2 {
    static final Object lock = new Object();
    private int breadCount = 0;

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    // в случаи когда используется synchronized block,методы wait() и
                    // notify обязательно писать с объектом на котором
                    // они синхронизированы! Пример: lock.wait() и  lock.notify();

                    // в параметре метода .wait(1000) можно указывать сколько ждать
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Буханка хлеба добавлена");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Буханка хлеба продана");
            System.out.println("Количество хлеба в магазине = " + breadCount);
            lock.notify();
        }
    }
}

class Producer2 implements Runnable {
    Market2 market;

    public Producer2(Market2 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}
class Consumer2 implements Runnable {
    Market2 market;

    public Consumer2(Market2 market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}