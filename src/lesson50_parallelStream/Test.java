package lesson50_parallelStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        int[] array = {8, 4, 22, 17, 1, 100, 95, 34, 56, 44, 66, 75, 13};
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 8, 4, 22, 17, 1, 100, 95, 34, 56, 44, 66, 75, 13);

        // .parallelStream() - использовать только тогда, когда от порядка сложений результат не изменится и когда
        // элементов очень много
        int result = integers.parallelStream().reduce((a, e) -> a + e).get();
        System.out.println(result);
        System.out.println(Arrays.stream(array).sum());
        System.out.println(Arrays.stream(array).reduce((a, e) -> a + e).getAsInt());

    }
}