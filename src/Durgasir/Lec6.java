package Durgasir;

import java.util.function.Predicate;

public class Lec6 {
    public static void main(String[] args) {
//        Predicate<Integer> p1= i->i%2==0;
//        System.out.println(p1.test(10));
//        System.out.println(p1.test(15));

       String[] s={"Aman","Rinkesh","sonam","chaso","sunny"};
       Predicate<String> p=s1->s1.length()>5;
        for(String s1: s)
        {
            if(p.test(s1)){
                System.out.println(s1);
            }
        }

    }
}
