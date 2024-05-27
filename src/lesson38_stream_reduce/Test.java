package lesson38_stream_reduce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 5, 8, 2, 4, 3);

        // Метод .reduce((accumulator, element)) в конкретном примере, умножает accumulator,
        // который содержит в начале значение первого элемента списка 5 на element (второе значение из списка). Далее результат
        // этого умножения присваивается accumulator - у, после accumulator умножается на следующий element, а конкретнее 2 и т.д
        // В итоге, мы получаем результат 960

        int result = integers.stream().reduce((accumulator, element) -> accumulator * element).get();

        // такой вариант использования метода, исключит шанс выбрасывания исключения, в случаи если, список будет пуст
        int result2 = integers.stream().reduce(1, (accumulator, element) -> accumulator * element);
        System.out.println(result);

        // вариант реализации, когда нужно в случаи возвращении null, сделать что-то другое
        List<Integer> list = new ArrayList<>();
        Optional<Integer> o = list.stream().reduce((a, e) -> a * e);
        if (o.isPresent()) {
            System.out.println(o);
        } else {
            System.out.println("Not present");
        }

        // использование метода в виде конкатенации строк
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "privet", "kak dela?", "ok", "poka");
        String list3 = strings.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(list3);
    }
}
