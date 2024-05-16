package lesson27_inner_class;

public class Car {
    private final String color;
    private final int doorCount;
    private final Engine engine;

    public Car(String color, int doorCount, int horsePower) {
        this.color = color;
        this.doorCount = doorCount;
        this.engine = this.new Engine(horsePower);
    }

    @Override
    public String toString() {
        return "My car{" +
                "color='" + color + '\'' +
                ", doorCount=" + doorCount +
                ", engine=" + engine +
                '}';
    }

    // поля inner класса не могут быть static, если только они не константы(1)
    public class Engine{
        private final int horsePower;
        private static final int B = 5;             // 1

        public Engine(int horsePower) {
            this.horsePower = horsePower;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car car = new Car("black",4,300);
        System.out.println(car);
    }
}