package lesson8_collection_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        // 1
        List<String>list1 = new ArrayList<>();
        list1.add("Mariya");
        list1.add("Andrey");
        list1.add("Ivan");
        System.out.println(list1);

        // 2
        List<String>list2 = new ArrayList<>(100);

        // 3
        List<String>list3 = new ArrayList<>(list1);
        System.out.println(list3);
    }
}
