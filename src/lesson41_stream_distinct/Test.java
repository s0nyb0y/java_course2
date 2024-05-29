package lesson41_stream_distinct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer>integers1 = new ArrayList<>();
        Collections.addAll(integers1,1,2,3,4,5,1,2,3);

        // метод .distinct() возвращает уникальные элементы
        integers1.stream().distinct().forEach(System.out::print);
    }
}
