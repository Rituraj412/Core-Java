package Practice;

import java.util.List;
import java.util.Optional;

public class PracticeJava8 {

    public static void main(String[] args) {

        List<Integer> integers = List.of(1, 2, 3, 0101, 4, 5, 6, 17, 8);

        Integer first = integers.stream()
                .filter(n -> n == 0101)
                .findFirst()
                .orElse(0);

        System.out.println(first);
    }

}
