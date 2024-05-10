package lesson20_HashSet;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

        // HashSet - это множество уникальных ключей, урезанный HashMap по сути. Поэтому не может содержать дубликаты,
        // но может содержать null. Не сохраняет порядка добавления
        Set<String> set = new HashSet<>();
        set.add("Marina");
        set.add("Mariya");
        set.add("Mikhail");
        set.add("Irina");
        set.add(null);
        for (String s : set) {
            System.out.println(s);
        }

        // метод .remove() удаляет указанный элемент
        set.remove("Mariya");
        System.out.println(set);

        // метод .size() возвращает размер множества
        System.out.println(set.size());

        // булевый .isEmpty() метод
        System.out.println(set.isEmpty());

        // булевый .contains() метод
        System.out.println(set.contains(null));

        HashSet<Integer>hashSet1 = new HashSet<>();
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(4);
        hashSet1.add(5);

        HashSet<Integer>hashSet2 = new HashSet<>();

        hashSet2.add(3);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(6);
        hashSet2.add(7);

        // .addAll() - Объединение двух множеств, без дубликатов. По причине, множество не может содержать дубликаты
        HashSet<Integer>hashSet = new HashSet<>(hashSet1);
//        hashSet.addAll(hashSet2);
//        System.out.println(hashSet);

        // .retainAll - Возвращает из двух множеств их пересечения. То есть те элементы которые есть в двух множествах
//        hashSet.retainAll(hashSet2);
//        System.out.println(hashSet);

        // .removeAll() - удаляет все элементы второго множества из первого
        hashSet.removeAll(hashSet2);
        System.out.println(hashSet);
    }
}
