package lesson25_Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test {
    public static void main(String[] args) {

        // Deque - дву направленная очередь
        Deque<Integer>deque = new ArrayDeque<>();
        // метод .addFirst() добавляет элемент в начала очереди, если в очереди нет мест, выбросит исключение
        deque.addFirst(3);
        deque.addFirst(5);
        // метод .addLast() добавляет элемент в конец очереди, если в очереди нет мест, выбросит исключение
        deque.addLast(7);
        // метод .offerFirst() добавляет элемент в начала очереди, в случаи если в очереди есть место
        deque.offerFirst(1);
        // метод .offerLast() добавляет элемент в конец очереди, в случаи если в очереди есть место
        deque.offerLast(8);
        System.out.println(deque);

        // метод .getFirst() возвращает первый элемент, если очередь пуста выбрасывает исключение
        System.out.println(deque.getFirst());
        // метод .getLast() возвращает последний элемент, если очередь пуста выбрасывает исключение
        System.out.println(deque.getLast());
        // метод .peekFirst() возвращает первый элемент, если очередь пуста возвращает null
        System.out.println(deque.peekFirst());
        // метод .peekLast() возвращает последний элемент, если очередь пуста возвращает null
        System.out.println(deque.peekLast());

        // метод .removeFirst() возвращает и сразу удаляет первый элемент, если очередь пуста выбрасывает исключение
        System.out.println(deque.removeFirst());
        // метод .removeLast() возвращает и сразу удаляет последний элемент, если очередь пуста выбрасывает исключение
        System.out.println(deque.removeLast());
        // метод .pollFirst() возвращает и сразу удаляет первый элемент, если очередь пуста возвращает null
        System.out.println(deque.pollFirst());
        // метод .pollLast() возвращает и сразу удаляет последний элемент, если очередь пуста возвращает null
        System.out.println(deque.pollLast());
    }
}
