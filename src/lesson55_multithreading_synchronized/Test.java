package lesson55_multithreading_synchronized;

public class Test {
    public static void main(String[] args) {
        MyRunnableImpl runnable = new MyRunnableImpl();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnableImpl implements Runnable {
    // Ключевое слово synchronized - после входа самого быстрого потока, закрывает доступ к телу метода, пока поток не выполнит
    // все действия описанные в нём. Только после этого, доступ к телу получает другой, более быстрый поток и т.д
    public synchronized void increment() {
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            increment();
        }
    }
}