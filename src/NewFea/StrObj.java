package NewFea;

import java.util.stream.Stream;

public class StrObj {

    public static void main(String[] args) {
//       blank
        Stream<Object> emptyStream=Stream.empty();

        String names[]={"rinkesh","rituraj","anand","chaso"};

        Stream<String> stream1 = Stream.of(names);
        stream1.forEach(e->{
            System.out.println(e);
        });
    }
}
