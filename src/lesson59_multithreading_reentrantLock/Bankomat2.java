package lesson59_multithreading_reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat2 {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee2("Ivan",lock);
        new Employee2("Marina",lock);
        new Employee2("Darina",lock);
        Thread.sleep(3000);
        new Employee2("Oleg",lock);
        new Employee2("Petr",lock);
    }
}

class Employee2 extends Thread {
    private final String name;
    private final Lock lock;

    public Employee2(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }else {
            System.out.println(name + " не хочет стоять в очереди");
        }
    }
}