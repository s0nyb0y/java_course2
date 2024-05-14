package lesson23;

import java.util.LinkedList;
import java.util.Queue;

public class Test {
    public static void main(String[] args) {

        // Queue - интерфейс, придерживается порядка fifo - first in first out(первый зашёл первый вышел)
        Queue<String>queue = new LinkedList<>();

        // метод .add() добавляет элемент в конец очереди, но если очередь ограничена и в ней нет места выбрасывает исключение
        queue.add("Mariya");
        queue.add("Marina");
        queue.add("Darina");
        queue.add("Elena");

        // метод .offer() добавляет элемент в конец очереди при условии того что в очереди есть место, иначе добавления не будет
        // Исключение не выбрасывается
        queue.offer("Sasha");

        System.out.println(queue);

        // метод .remove() возвращает первый элемент из очереди и сразу его удаляет, если попытаться удалить элемент
        // из пустой очереди, выбросится исключение
        System.out.println(queue.remove());

        // метод .poll() возвращает первый элемент из очереди и сразу его удаляет, если попытаться удалить элемент
        // из пустой очереди, исключение выбрасываться не будет, просто вернётся null
        System.out.println(queue.poll());

        // метод .element() возвращает первый элемент на выход, ничего с ним не делает. Если очередь пустая выбросится исключение
        System.out.println(queue.element());

        // метод .peek() возвращает первый элемент на выход, ничего с ним не делает. Если очередь пустая вернёт null
        System.out.println(queue.peek());
    }
}
