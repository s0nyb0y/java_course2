package lesson4_parametrized_method;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer>integersList = new ArrayList<>();
        Collections.addAll(integersList,77,25,50);
        int secondNumber = GenMethod.getSecondElement(integersList);
        System.out.println(secondNumber);

        ArrayList<String>stringsList = new ArrayList<>();
        Collections.addAll(stringsList,"Hi","Hello","Bye");
        String secondWord = GenMethod.getSecondElement(stringsList);
        System.out.println(secondWord);
    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T>al){
        return al.get(1);
    }
}

