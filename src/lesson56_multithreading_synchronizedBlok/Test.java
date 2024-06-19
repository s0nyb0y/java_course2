package lesson56_multithreading_synchronizedBlok;

public class Test {
    public static void main(String[] args) {
        MyThread runnable = new MyThread();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
    }
}

class Counter {
    static int count = 0;
}

class MyThread implements Runnable {
    private void doWork2(){
        System.out.println("Hello");
    }
    private void doWork1() {
        doWork2();
        // Synchronized block позволяет синхронизировать отдельную часть кода, а не метод целиком. Если метод НЕ статический
        // синхронизируемся на ключевом слове this, иначе на имени класса, пример:
        // synchronized (MyThread.class) {...}
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            doWork1();
        }
    }
}