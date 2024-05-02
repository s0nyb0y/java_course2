package lesson11_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<String>list1 = new ArrayList<>();
        list1.add("Mariya");
        list1.add("Elena");
        list1.add("Anastasiya");
        list1.add("Victoriya");

        Iterator<String>iterator = list1.iterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.remove();
        }
        System.out.println(list1);
    }
}
