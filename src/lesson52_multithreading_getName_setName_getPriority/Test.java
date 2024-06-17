package lesson52_multithreading_getName_setName_getPriority;

public class Test {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();

        // метод .setName() позволяет назначить имя потоку
        myThread1.setName("moy_potok");

        // метод .setPriority() назначает приоритет потоку, максимальное значение 10, варианты:
        myThread1.setPriority(Thread.MIN_PRIORITY);
        myThread1.setPriority(Thread.NORM_PRIORITY);
        myThread1.setPriority(Thread.MAX_PRIORITY);
        myThread1.setPriority(5);
        System.out.println("Name of myThread = " + myThread1.getName() + ", Priority of myThread = " + myThread1.getPriority());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("privet");
    }
}