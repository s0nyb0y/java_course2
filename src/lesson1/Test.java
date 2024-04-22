package lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee(100, "Ivan", "Petrov", 250);
        Employee employee2 = new Employee(15, "Petr", "Ivanov", 150);
        Employee employee3 = new Employee(123, "Ivan", "Sidorov", 2500);
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        System.out.println("Before sorting:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
        System.out.println("\nAfter sorting:");
        Collections.sort(employeeList);
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}

class Employee implements Comparable<Employee> {
    private final int id;
    private final String name;
    private final String surname;
    private final int salary;

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
    public int compareTo(Employee anotherEmp) {

//        первый вариант:
//        if (this.id > anotherEmp.id){
//            return 1;
//        } else if (this.id < anotherEmp.id) {
//            return -1;
//        }else {
//            return 0;
//        }

//        второй вариант:
//        return this.id - anotherEmp.id;

//        третий вариант:
//        return this.name.compareTo(anotherEmp.name);

        int result = this.name.compareTo(anotherEmp.name);
        if (result == 0) {
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
    }
}
