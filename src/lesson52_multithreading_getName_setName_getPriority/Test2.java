package lesson52_multithreading_getName_setName_getPriority;

public class Test2 implements Runnable {

    @Override
    public void run() {
        // метод .currentThread().getName() возвращает текущее имя потока
        System.out.println("Method run. Thread name = " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Test2());
        thread.start();
        System.out.println("Method main. Thread name = " + Thread.currentThread().getName());
    }
}
