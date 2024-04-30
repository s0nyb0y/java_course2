package lesson9;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String>list1 = new ArrayList<>();
        list1.add("Anna");
        list1.add("Artem");
        list1.add("Aleksey");
        list1.add("Anna");
        System.out.println(list1);

        List<String>list2 = new ArrayList<>();
        list2.add("!!!");
        list2.add("???");

        // добавление списка в конкретное место списка. Если не указывать индекс, то второй список добавится в конец первого
        list1.addAll(1,list2);
        System.out.println(list1);

        // нахождение первого вхождения элемента в списке
        int index = list1.indexOf("???");
        System.out.println(index);

        // метод возвращает true если элемент есть в списке и false если отсутствует
        System.out.println(list1.contains("Artem"));

        // нахождение последнего вхождения элемента в списке
        System.out.println(list1.lastIndexOf("Anna"));

        // вывод размера списка
        System.out.println(list1.size());

        // очистка списка
        list1.clear();
        System.out.println(list1);

        // проверка списка на пустоту
        System.out.println(list1.isEmpty());
    }
}
