package lesson14_collections_methods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
    public static void main(String[] args) {
        Employee emp1 = new Employee(155, "Mariya", 123);
        Employee emp2 = new Employee(255, "Svetlana", 110);
        Employee emp3 = new Employee(55, "Mikhail", 250);
        Employee emp4 = new Employee(15, "Igor", 55);
        Employee emp5 = new Employee(55, "Evgeniy", 423);
        Employee emp6 = new Employee(355, "Sasha", 223);
        Employee emp7 = new Employee(55, "Anatoliy", 323);
        Employee emp8 = new Employee(185, "Victoriya", 223);

        List<Employee> list = new ArrayList<>();

        // метод .addAll() добавляет элементы в список
        Collections.addAll(list, emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8);

        // метод .sort() сортирует элементы от мин до макс
        Collections.sort(list);
        for (Employee emp : list) {
            System.out.println(emp);
        }

        // метод .binarySearch() возвращает индекс искомого элемента
        int index = Collections.binarySearch(list, new Employee(355, "Sasha", 223));
        System.out.println(index);

        int[] array = {-3, 8, 12, -8, 0, 5, 10, 150, -30, 19};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.binarySearch(array,10));

        List<Integer>integers = new ArrayList<>();
        for (int i: array){
            integers.add(i);
        }

        // метод .reverse() возвращает элементы в зеркальном положении
        Collections.reverse(integers);
        System.out.println(integers);

        // метод .shuffle() перемешивает элементы
        Collections.shuffle(integers);
        System.out.println(integers);
    }
}

class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;
    private final int salary;

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.id - o.id;
        if (result == 0) {
            result = this.name.compareTo(o.name);
        }
        return result;
    }
}
