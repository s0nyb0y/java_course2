package lesson31_lambda2;

public class Student {
    private final String name;
    private final int age;
    private final char sex;
    private final int course;
    private final double avgGrade;

    public Student(String name, int age, char sex, int course, double avgGrade) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.course = course;
        this.avgGrade = avgGrade;
    }

    public String getName() {
        return name;
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
                ", avg=" + avgGrade +
                '}';
    }
}
