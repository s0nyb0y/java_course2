package lesson26_static_nested_class;

public class Car {
    private final String color;
    private final int doorCount;
    private final Engine engine;
    private static String a;                            // 3

    public Car(String color, int doorCount, Engine engine) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = engine;
    }

    void method(){
        System.out.println(Engine.countOfObject);     // 4
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // вложенные статические классы могут содержать статические(2) и не статические(1) элементы
    // статический вложенный класс может обращаться напрямую к private элементам(3) внешнего класса и наоборот(4),
    // но только к static
    public static class Engine{
        private final int horsePower;                   // 1
        static int countOfObject;                       // 2
        public Engine(int horsePower) {
            System.out.println(a);                      // 3
            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "My engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(1000);
        Car car = new Car("Black",2,engine);
        System.out.println(car);
        car.method();
    }
}