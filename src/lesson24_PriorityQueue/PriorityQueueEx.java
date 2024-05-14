package lesson24_PriorityQueue;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        Student student1 = new Student("Mariya", 3);
        Student student2 = new Student("Marina", 5);
        Student student3 = new Student("Darina", 1);
        Student student4 = new Student("Elena", 4);
        Student student5 = new Student("Sofiya", 2);

        // PriorityQueue - приоритетная очередь, использует элементы используя приоритет, вне зависимости от порядка
        // добавления в очередь. От меньшего к большему
        PriorityQueue<Student>priorityQueue = new PriorityQueue<>();
        priorityQueue.add(student1);
        priorityQueue.add(student2);
        priorityQueue.add(student3);
        priorityQueue.add(student4);
        priorityQueue.add(student5);

        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());
    }
}

class Student implements Comparable<Student> {
    private final String name;
    private final int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Student student = (Student) object;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
