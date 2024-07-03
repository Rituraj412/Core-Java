package NewFea;


@FunctionalInterface
interface Practice{
    public abstract int m1(int x,int y);
}

public class Test {

    public static void main(String[] args) {


        Practice p= (x, y) -> x+y;

    }
}
