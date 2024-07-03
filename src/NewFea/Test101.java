package NewFea;

import java.sql.SQLOutput;

public class Test101 {
    public static void main(String[] args) {
       Interf2 i= (a,b)-> System.out.println("Hello..."+(a+b));
       i.add(10,20);
        i.add(12,20);
        i.add(13,20);
    }
}
//@FunctionalInterface
//interface Interf2
//{
//    public void m1();
//
//}


//Functional interface wrt inheritance:
//@FunctionalInterface
//interface Ab{
//    public void m1();
//}
//
//interface Bc extends Ab{
//        public void m2();
//}

// Lambda expression with functional interface.

interface Interf2{
    public void add(int a,int b);
}

