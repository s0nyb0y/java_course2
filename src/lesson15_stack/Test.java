package lesson15_stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        Stack<String>stack = new Stack<>();

        // метод .push() добавляет элемент в конец stack
        stack.push("Misha");
        stack.push("Masha");
        stack.push("Pasha");
        stack.push("Dasha");
        stack.push("Sasha");

        // метод .peek() возвращает последний элемент из stack
        System.out.println(stack.peek());
        System.out.println(stack);

        // метод .isEmpty() проверяет stack на наличие элементов в stack, если элементы есть, возвращает true иначе false
        while (!stack.isEmpty()){

            // метод .pop() возвращает последний элемент из stack и удаляет его
            System.out.println(stack.pop());
            System.out.println(stack);
        }
    }
}
