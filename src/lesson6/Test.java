package lesson6;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        Collections.addAll(integers, 124, 54, 789);
        int secondInt = GenMethod.getSecondElement(integers);
        System.out.println(secondInt);
    }
}

class GenMethod {
    public static <T extends Number> T getSecondElement(ArrayList<T> al) {
        return al.get(1);
    }
}