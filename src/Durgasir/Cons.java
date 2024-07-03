package Durgasir;

import java.util.function.Consumer;

public class Cons {
    public static void main(String[] args) {
        Consumer<String> c= s-> System.out.println(s);
        c.accept("rinkesh");
    }
}
