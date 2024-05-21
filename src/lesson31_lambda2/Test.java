package lesson31_lambda2;

public class Test {
    static void def(I i){
        System.out.println(i.abc());
    }
    public static void main(String[] args) {
        def(() -> 18);                                           // 1
    }
}
interface I{
    // если параметры в функциональном интерфейсе пустые, то и в лямбде выражении они указываются пустыми(1)
    int abc();
}
