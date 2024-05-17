package lesson29_Anonymous_class;

public class AnonymousClass {
    private int x = 10;                         // 1
    public static void main(String[] args) {

        // Анонимный класс не имеет имени, в нём не возможно создать конструктор по причине отсутствия имени
        // Анонимный класс может обращаться к private элементам внешнего класса(1)
        Math m = new Math() {
            @Override
            public int doOperations(int a, int b) {
                AnonymousClass ac = new AnonymousClass();     // 1
                System.out.println(ac.x);
                return a + b;
            }
        };
        Math m2 = new Math() {
            @Override
            public int doOperations(int a, int b) {
                return a * b;
            }
        };
        System.out.println(m.doOperations(3,6));
        System.out.println(m2.doOperations(3,6));
    }
}
interface Math{
    int doOperations(int a, int b);
}
