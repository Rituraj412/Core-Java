package NewFea;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {

        Optional<String> myopts=Optional.empty();
        System.out.println("1."+myopts);  // Optional.empty
        System.out.println("2."+myopts.orElse("Hello guys")); // Hello guys
        System.out.println("3."+myopts); // Optional.empty
        System.out.println("4."+myopts.isPresent()); // false

//        System.out.println("5."+myopts.get());  // NoSuchElementException

        if(myopts.isPresent()){
            System.out.println("5."+myopts.get());
        }else{
            System.out.println("6. No value Found");
        }

        boolean age = checkAge(17);
//        System.out.println(age);

    }

    private static boolean checkAge(int personAge) {
        return personAge >=18;
        /*if(personAge>=18) {
            return true;
        }
        else {
            return false;
        }*/
    }
}
