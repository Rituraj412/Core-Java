package NewFea;

import java.util.Optional;

public class Optional4 {
    public static void main(String[] args) {

        String str=null;
        Optional<String> myopts=Optional.ofNullable(str);

        System.out.println("1."+myopts);
        System.out.println("2."+myopts.orElse("Hello guys"));
        System.out.println("3."+myopts);
        System.out.println("4."+myopts.isPresent());


        if(myopts.isPresent()){
            System.out.println("5."+myopts.get());
        }else {
            System.out.println("6. No value Found");
        }
    }
}
