package Durgasir;

import java.util.ArrayList;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Bi {

//    public static void main(String[] args) {
//        BiPredicate<Integer,Integer> p=(a,b)->(a+b) % 2==0;
//        System.out.println(p.test(10,20));
//        System.out.println(p.test(15,20));
//    }

    public static void main(String[] args) {

        ArrayList<Employee> l=new ArrayList<>();
        BiFunction<Integer,String,Employee> f=(eno,name)->new Employee(eno,name);

        l.add(f.apply(100,"rinkesh"));
        l.add(f.apply(200,"pinkesh"));
        l.add(f.apply(300,"cinkesh"));
        l.add(f.apply(400,"minkesh"));
        for(Employee e:l)
        {

            System.out.println("Employee Number:"+e.eno);
            System.out.println("Employee Name:"+e.name);
            System.out.println();
        }
    }
}
class Employee{
    int eno;
    String name;

    Employee(int eno,String name){
        this.eno=eno;
        this.name=name;
    }
}
