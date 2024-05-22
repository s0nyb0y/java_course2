package lesson33_lambda_supplier;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Test {

    // Интерфейс Supplier имеет один метод .get(), ничего в параметры не принимает
    // Интерфейс Supplier - возвращает элементы, н-ное количество раз
    static List<Car>createThreeCars(Supplier<Car>carSupplier){
        List<Car>list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(carSupplier.get());
        }
        return list;
    }
    public static void main(String[] args) {
        List<Car>ourCars = createThreeCars(() -> new Car("Skoda","white",1.6));
        System.out.println("Our cars: " + ourCars);
    }
}
class Car{
    private final String name;
    private final String color;
    private final double engine;

    public Car(String name, String color, double engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}