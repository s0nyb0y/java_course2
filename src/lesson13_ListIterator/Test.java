package lesson13_ListIterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Test {
    public static void main(String[] args) {
        String s = "madam";
        List<Character> list = new LinkedList<>();
        for (Character ch: s.toCharArray()){
            list.add(ch);
        }
        System.out.println(list);

        ListIterator<Character>listIterator = list.listIterator();
        ListIterator<Character>reverslistIterator = list.listIterator();

        boolean isPalindrome = true;

        while (listIterator.hasNext() && reverslistIterator.hasPrevious()){
            if (listIterator.next() != reverslistIterator.previous()){
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome){
            System.out.println("Words " + s + " is Palindrome");
        }
    }
}
