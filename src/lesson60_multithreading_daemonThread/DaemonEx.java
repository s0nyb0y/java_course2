package lesson60_multithreading_daemonThread;

public class DaemonEx {
    public static void main(String[] args) {
        System.out.println("Main thread starts");
        UserThread userThread = new UserThread();
        userThread.setName("user_thread");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setName("daemon_thread");
        // метод .setDaemon(true) создаёт поток демон, обязательно объявлять его до запуска потока!!!
        daemonThread.setDaemon(true);
        userThread.start();
        daemonThread.start();
        System.out.println("Main thread ends");
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (char i = 'A'; i <= 'J'; i++){
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
class DaemonThread extends Thread {
    // Демон потоки предназначены для выполнения фоновых задач и оказания различных сервисов User потокам.
    // При завершении работы последнего User потока, программа завершает своё выполнение, не дожидаясь окончания
    // Daemon потоков.
    @Override
    public void run() {
        // boolean метод isDaemon() возвращает true или false
        System.out.println(Thread.currentThread().getName() + " is daemon: " + isDaemon());
        for (int i = 1; i <= 1000; i++){
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}