package lesson16_Map;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map<Integer,String>map = new HashMap<>();

        // метод .put() добавляет элемент в Map, ключ и значения могут быть null. Если при использовании метода .put()
        // в Map уже есть элемент с таким же ключом, тогда элемент перезаписывается.
        // Порядок добавления в HashMap не сохраняется
        map.put(1000,"Mariya Petrova");
        map.put(2456,"Oleg Smirnov");
        map.put(3555,"Danil Guchin");
        map.put(2487,"Darya Ivanova");
        map.put(5478,"Kiril Sidorov");

        System.out.println(map);

        // метод .putIfAbsent() добавляет элемент, если такого элемента с таким ключом в Map нет
        map.putIfAbsent(1000,"Stas Mikhailov");
        System.out.println(map);

        // метод .get() возвращает элемент по ключу, если такого ключа не будет в Map, вернётся null
        System.out.println(map.get(2456));

        // метод .remove() удаляет элемент по ключу
        map.remove(2456);
        System.out.println(map);

        // булевый метод .containsKey() проверяет наличие элемента по ключу
        System.out.println(map.containsKey(5478));

        // булевый метод .containsValue() проверяет наличие элемента по значению
        System.out.println(map.containsValue("Oleg Smirnov"));

        // метод .keySet() возвращает все ключи или множество ключей
        System.out.println(map.keySet());

        // метод .values() возвращает все значения или множество значений
        System.out.println(map.values());
    }
}
