package lesson43_stream_flatMap;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student st1 = new Student("Mariya",20,'f',3);
        Student st2 = new Student("Mikhail",19,'m',2);
        Student st3 = new Student("Marina",18,'f',1);
        Student st4 = new Student("Darina",21,'f',4);

        Faculty f1 = new Faculty("Economics");
        Faculty f2 = new Faculty("Biology");

        f1.addStudentsToFaculty(st1);
        f1.addStudentsToFaculty(st2);

        f2.addStudentsToFaculty(st3);
        f2.addStudentsToFaculty(st4);

        List<Faculty>facultyList = new ArrayList<>();
        facultyList.add(f1);
        facultyList.add(f2);

        // метод .flatMap() позволяет получить элементы элементов потока
        facultyList.stream().flatMap(faculty -> faculty.getStudentsOnFaculty().stream())
                .forEach(student -> System.out.println(student.getName()));
    }
}
class Faculty{
    private final String name;
    private final List<Student>studentsOnFaculty;

    public Faculty(String name) {
        this.name = name;
        studentsOnFaculty = new ArrayList<>();
    }

    public List<Student> getStudentsOnFaculty() {
        return studentsOnFaculty;
    }

    public String getName() {
        return name;
    }

    void addStudentsToFaculty(Student student){
        studentsOnFaculty.add(student);
    }
}
class Student{
    private final String name;
    private final int age;
    private final char sex;
    private final int course;

    public Student(String name, int age, char sex, int course) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", course=" + course +
                '}';
    }
}