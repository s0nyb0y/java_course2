package lesson58_multithreading_deadLock;

public class DeadLockEx {
    // во избежание DeadLock'а, нужно синхронизироваться на объектах, в одном и том же порядке
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        thread1.start();
        thread2.start();
    }
}
class Thread1 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread1 : Попытка захватить монитор объекта lock1");
        synchronized (DeadLockEx.lock1){
            System.out.println("Thread1 : монитор объекта lock1 захвачен");
            System.out.println("Thread1 : Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock2){
                System.out.println("Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread2 : Попытка захватить монитор объекта lock2");           // заменить чтобы не было DeadLock
        synchronized (DeadLockEx.lock2){                                                   // DeadLockEx.lock1
            System.out.println("Thread2 : монитор объекта lock2 захвачен");
            System.out.println("Thread2 : Попытка захватить монитор объекта lock2");
            synchronized (DeadLockEx.lock1){                                               // DeadLockEx.lock2
                System.out.println("Мониторы объектов lock1 и lock2 захвачены");
            }
        }
    }
}