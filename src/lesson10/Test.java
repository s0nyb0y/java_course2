package lesson10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("A");
        StringBuilder sb2 = new StringBuilder("B");
        StringBuilder sb3 = new StringBuilder("C");
        StringBuilder sb4 = new StringBuilder("D");

        StringBuilder[]array = {sb1,sb2,sb3,sb4};

        // метод Arrays.asList() добавляет указанный в параметрах массив в list
        List<StringBuilder>list = Arrays.asList(array);
        System.out.println(list);

        List<String>strings1 = new ArrayList<>();
        strings1.add("Anna");
        strings1.add("Ben");
        strings1.add("Sara");
        strings1.add("Den");

        List<String>strings2 = new ArrayList<>();
        strings2.add("Ben");
        strings2.add("Den");
        strings2.add("Glen");

        // метод возвращает view элементов ноходящиеся в промежутке индексов указанных в параметрах.
        // Первый индекс включая, второй нет
        System.out.println(strings1.subList(1,2).add("Aleksey"));
        System.out.println(strings1);

        // метод containsAll возвращает true если элементы из strings2 100% соответствуют элементам из strings1
        // , иначе возвр false
        System.out.println(strings1.containsAll(strings2));

        // метод retainAll возвращает элементы у которых нет в двух strings дубликатов
        strings1.retainAll(strings2);
        System.out.println(strings1);

        // метод removeAll возвращает элементы у которых в двух strings есть дубликаты
        strings1.removeAll(strings2);
        System.out.println(strings1);

        // метод strings1.toArray(Т) добавляет в массив элементы list
        String[]arrayString = strings1.toArray(new String[0]);
        for (String s: arrayString){
            System.out.println(s);
        }

        // статичный метод List.of() добавляет элементы в список, минус метода в том
        // , что потом список не изменяем и не может содержать null
        List<Integer>integers = List.of(3,8,13);
        System.out.println(integers);

        // метод копирует элементы из массива указанного в параметрах, минус метода в том
        // , что потом список не изменяем и не может содержать null
        List<Integer>integers2 = List.copyOf(integers);
        System.out.println(integers2);
    }
}
