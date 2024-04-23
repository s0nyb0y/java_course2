package lesson3_parametrized_class;

public class Test {
    public static void main(String[] args) {
        Info<String>info = new Info<>("Hello");
        Info<Integer>info1 = new Info<>(777);
        System.out.println(info + "\n" + info1);

        Info2<String,Integer>info2 = new Info2<>("Ivan",33);
        System.out.println("value1 = " + info2.getValue1() + " , value2 = " + info2.getValue2());

        Info3<String>info3 = new Info3<>("Ivan","Ivanov");
        System.out.println("value1 = " + info3.getValue1() + " , value2 = " + info3.getValue2());
    }
}

//один аргумент:
class Info<T>{
    private final T value;

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "{[" + value + "]}";
    }
}

//два аргумента с разными типами:
class Info2<V1,V2>{
    private final V1 value1;
    private final V2 value2;

    public Info2(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }
}

//два аргумента с одним типом:
class Info3<V>{
    private final V value1;
    private final V value2;

    public V getValue1() {
        return value1;
    }

    public V getValue2() {
        return value2;
    }

    public Info3(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }
}