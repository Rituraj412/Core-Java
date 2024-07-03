package Durgasir;

import java.util.function.Consumer;

public class Con1 {

    public static void main(String[] args) {

        Consumer<Movie> c1= m-> System.out.println(m.name+" ready to release");
        Consumer<Movie> c2= m-> System.out.println(m.name+" Flop");
        Consumer<Movie> c3= m-> System.out.println(m.name+" info in database");
        Consumer<Movie> cc=c1.andThen(c2).andThen(c3);

        Movie m=new Movie("Bahubali");
        cc.accept(m);

    }
}
class Movie{
    String name;
    Movie(String name){
        this.name=name;
    }
}
