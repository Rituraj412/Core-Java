package Durgasir;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Lec3 {
//    public static void main(String[] args) {
//        Interf1 i= n -> n*n;
//        System.out.println(i.squareIt(4));
//        System.out.println(i.squareIt(4));
//        System.out.println(i.squareIt(5));
//    }

//@FunctionalInterface
//interface Interf1{
//    public int squareIt(int n);
//}

    //multithreading concept
    public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        l.add(20);
        l.add(10);
        l.add(30);
        l.add(40);
        l.add(5);
        l.add(25);
        l.add(0);
        System.out.println(l);
        Collections.sort(l,new MyComparator());
        System.out.println(l);
    }
}
class MyComparator implements Comparator<Integer>
{
    public int compare(Integer I1,Integer I2)
    {
        if(I1<I2)
        {
            return -1;
        } else if (I1>I2) {
            return +1;

        }
        else {
            return 0;
        }
    }
}

