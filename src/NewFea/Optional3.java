package NewFea;

import java.util.Optional;

public class Optional3 {
    public static void main(String[] args) {

        String str=null;
        Optional<String> myopts=Optional.of(str);
        System.out.println(myopts);
    }
}
