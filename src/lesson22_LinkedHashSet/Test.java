package lesson22_LinkedHashSet;

import java.util.LinkedHashSet;

public class Test {
    public static void main(String[] args) {
        // LinkedHashSet сохраняет порядок добавления элементов
        LinkedHashSet<Integer>lhs = new LinkedHashSet<>();
        lhs.add(7);
        lhs.add(2);
        lhs.add(3);
        lhs.add(1);
        lhs.add(6);
        lhs.add(5);
        System.out.println(lhs);

        lhs.remove(3);
        System.out.println(lhs);
        System.out.println(lhs.contains(3));
    }
}
