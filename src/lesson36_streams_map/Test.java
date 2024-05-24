package lesson36_streams_map;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "privet", "kak dela", "ok", "poka");

        // .stream() преобразовывает list в поток
        // метод .map() берёт по очереди каждый элемент и сопоставляет ему элемент, который из него получается после применения
        // на нём, тех действий, которые мы описываем внутри map с помощью лямбда выражения.
        // .collect(Collectors.toList()) - преобразовывает поток в лист

        // МЕТОДЫ stream() НЕ МЕНЯЮТ list ИЛИ МАССИВ НА КОТОРОМ БЫЛИ ВЫЗВАНЫ !!!
        List<Integer> integers = strings.stream().map(el -> el.length()).collect(Collectors.toList());
//        integers.forEach(el -> System.out.println(el));

        int[] array = {9, 3, 3, 5, 6, 7};
        int[] array2 = Arrays.stream(array).map(el -> {
            if (el % 3 == 0) {
                el /= 3;
            }
            return el;

            // метод .toArray() преобразовывает поток в массив
        }).toArray();

        Arrays.stream(array2).forEach(el -> System.out.println(el));

        Set<String>stringTreeSet = new TreeSet<>();
        Collections.addAll(stringTreeSet,"privet", "kak dela", "ok", "poka");

        // метод .collect(Collectors.toSet()) преобразовывает поток в Set
        Set<Integer>integerTreeSet = stringTreeSet.stream().map(e -> e.length()).collect(Collectors.toSet());
        integerTreeSet.forEach(el -> System.out.println(el));
    }
}
