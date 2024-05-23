package lesson34_lambda_Consumer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {
    static List<Car> ourCars(Supplier<Car> carSupplier) {
        List<Car> carList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            carList.add(carSupplier.get());
        }
        return carList;
    }

    // Интерфейс Consumer - потребитель. Используется когда с элементом нужно что-то сделать(изменить, вывести в консоль)
    static void changeCar(Car car, Consumer<Car> carConsumer) {

        // в параметры метода .accept() указывается элемент, с которым будут совершаться какие-либо манипуляции
        carConsumer.accept(car);
    }

    public static void main(String[] args) {
        List<Car> carList = ourCars(() -> new Car("Skoda", "Wite", 1.6));
        carList.forEach(el -> System.out.println(el));
        changeCar(carList.get(0), car -> {
            car.setName("Audi");
            car.setColor("black");
            car.setEngine(3.0);
        });
        carList.forEach(el -> System.out.println(el));

        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 1, 2, 3, 4, 5, 6);
        integers.forEach(el -> {
            System.out.println(el);
            el *= 2;
            System.out.println(el);
        });

    }
}

class Car {
    private String name;
    private String color;
    private double engine;

    public Car(String name, String color, double engine) {
        this.name = name;
        this.color = color;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEngine(double engine) {
        this.engine = engine;
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