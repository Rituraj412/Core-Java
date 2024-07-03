package NewFea;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        String str=null;

        Optional<Object> optional = Optional.empty();

        System.out.println(false);
        System.out.println(true);
        System.out.println(optional.toString());
        System.out.println(optional.orElse("no object"));
    }
}
