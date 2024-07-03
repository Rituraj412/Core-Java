package Durgasir;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Lec72 {

    public static void main(String[] args) {
        Function<Student, String> f= s->{
            int marks=s.marks;
            String grade=" ";
            if(marks>=80) grade="A[Dist]";
            else if (marks>=60) grade="B[Fc]";
            else if(marks>=50) grade="C[Sc]";
            else if(marks>=35) grade="D[Tc]";
            else grade="E[Fail]";
            return grade;
        };

        Predicate<Student> p=s->s.marks>=60;

        Consumer<Student> c=s1->{
            System.out.println("Student Name:" + s1.name);
            System.out.println("Student Marks:" + s1.marks);
            System.out.println("Student Grade:" + f.apply(s1));
            System.out.println();

        };

        Student[] s={
                new Student("Aman",100),
                new Student("rinkesh",65),
                new Student("love",55),
                new Student("sonam",45),
                new Student("raushan",25)
        };
        for(Student s1 : s) {

            if(p.test(s1)) {
                c.accept(s1);
            }
        }
    }
}

class Student{
    String name;
    int marks;
    Student(String name,int marks)
    {
        this.name=name;
        this.marks=marks;
    }
}
