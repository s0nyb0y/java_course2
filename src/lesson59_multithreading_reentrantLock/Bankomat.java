package lesson59_multithreading_reentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Employee("Ivan",lock);
        new Employee("Petr",lock);
        new Employee("Marina",lock);
        new Employee("Mariya",lock);
        new Employee("Darina",lock);
    }
}

class Employee extends Thread {
    private final String name;
    private final Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        try {
            System.out.println(name + " ждёт...");
            lock.lock();
            System.out.println(name + " пользуется банкоматом");
            Thread.sleep(2000);
            System.out.println(name + " завершил(а) свои дела");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}