package NewFea;

import java.util.List;
import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {
        String str="Srinivas";
        Optional<String> myopts=Optional.of(str);
        System.out.println("1."+myopts); // Optional[Srinivas]
        System.out.println("2."+myopts.orElse("Hello guys"));
        System.out.println("3."+myopts);
        System.out.println("4."+myopts.isPresent());

        System.out.println("5."+myopts.get());

        if(myopts.isPresent()){
            System.out.println("5."+myopts.get());
        }else{
            System.out.println("6. No value Found");
        }

        List<String> list = List.of("abc", "xyz", "pqr");

        Optional<List<String>> s1 = Optional.ofNullable(list);
        if(s1.isPresent()){
            System.out.println("impl");
        }

        Optional.ofNullable(list).ifPresent(s->{
            System.out.println("impl-2");
        });

    }

}
