package lesson7;

import java.util.ArrayList;
import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        ArrayList<String>strings = new ArrayList<>();
        Collections.addAll(strings,"hello","ok","bye");
        showListInfo(strings);

        ArrayList<Integer>integers = new ArrayList<>();
        Collections.addAll(integers,123,456,789);
        System.out.println(integers);

        ArrayList<Double>ald = new ArrayList<>();
        Collections.addAll(ald,3.14,3.15,3.16);
        System.out.println(sum(ald));

        ArrayList<Integer>ali = new ArrayList<>();
        Collections.addAll(ali,3,30,35);
        System.out.println(sum(ali));
    }
    static void showListInfo(ArrayList<?>list){
        System.out.println(list);
    }
    static double sum(ArrayList<? extends Number>al){
        double sum = 0;
        for (Number n : al){
            sum += n.doubleValue();
        }
        return sum;
    }
}
