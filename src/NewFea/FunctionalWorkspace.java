package NewFea;

import java.util.List;
import java.util.function.Predicate;

public class FunctionalWorkspace {

    public static void main(String[] args) {
        Interf i = () -> {
            System.out.println("m1 in main");
        };

        i.m1();

        Predicate<Integer> p1 = (n) -> {
            return n > 5;
        };

        Predicate<Integer> p2 = n -> n % 2 == 0;

        System.out.println("=========Predicate examples=========");
        System.out.println(p1.test(6));
        System.out.println(p2.test(10));
        System.out.println(p2.test(11));

        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Integer k =integerList.stream()
                .filter(x->x%2==0)
                .findFirst()
                .get();
        System.out.println(k);

        List<Integer> k2 =integerList.stream()
                .filter(x-> p2.test(x))
                .toList();
        System.out.println(k2);

        List<Integer> k3 =integerList.stream()

//                .filter(x-> p2.test(x))
//                .filter(y-> p1.test(y))

//                .filter(x-> p2.test(x)&& p1.test(x))

//                .filter(x-> p2.or(p1).test(x))
//                .filter(x-> p2.and(p1).test(x))
                .filter(x->p2.negate().and(p1).test(x))
                .toList();
        System.out.println(k3);
    }
}

@FunctionalInterface
interface Interf {
    abstract void m1();
}
