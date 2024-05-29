package lesson42_stream_count_peek;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[]array = {1,2,3,4,5,6,7,1,2,3};
        // метод .count() возвращает количество элементов в потоке
        System.out.println(Arrays.stream(array).count());

        // метод .peek() похож на forEach, но позволяет продолжить цепочку stream
        System.out.println(Arrays.stream(array).distinct().peek(System.out::println).count());
    }
}
