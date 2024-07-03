package Durgasir;

import java.util.Date;
import java.util.function.Supplier;

public class Sup {

    public static void main(String[] args) {

        Supplier<Date> s=()->new Date();
        System.out.println(s.get());
        System.out.println(s.get());
        System.out.println(s.get());
    }
}
