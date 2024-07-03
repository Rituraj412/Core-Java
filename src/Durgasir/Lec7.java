package Durgasir;

import java.util.function.Function;
import java.util.function.Predicate;

public class Lec7 {

    public static void main(String[] args) {
//        check even odd;
//        Predicate<Integer> p= i-> i%2==0;
//        System.out.println(p.test(10));

//        Square of integer.
//        Function<Integer, Integer> f= i-> i*i;
//        System.out.println(f.apply(4));
//        System.out.println(f.apply(8));

//        s.length() method
//        Function<String, Integer> f= s-> s.length();
//        System.out.println(f.apply("rinkeshvats Parsama"));

        Function<String, String> f=s -> s.toUpperCase();
        System.out.println(f.apply("rinkesh"));
    }

}
