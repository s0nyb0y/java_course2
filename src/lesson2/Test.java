package lesson2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Collections.addAll(list, new Employee(555, "Ivan", "Ivanov", 125)
                , new Employee(5, "Petr", "Petrov", 222)
                , new Employee(55, "Ivan", "Sidorov", 333));

        System.out.println("before sorting:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
        Collections.sort(list, new SalaryComparator());
        System.out.println("\nafter sorting:");
        for (Employee emp : list) {
            System.out.println(emp);
        }
    }
}

class Employee implements Comparable<Employee> {
    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int result = this.name.compareTo(o.name);
        if (result == 0) {
            result = this.surname.compareTo(o.surname);
        }
        return result;
    }
}

class NameComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}

class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.salary - o2.salary;
    }
}