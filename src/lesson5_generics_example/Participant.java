package lesson5_generics_example;

public abstract class Participant {
    private final String name;
    private final int age;

    public Participant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
