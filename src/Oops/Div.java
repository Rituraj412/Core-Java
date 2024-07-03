package Oops;

public class Div implements Calculate{
    @Override
    public void Calculate(int a, int b) {
        int c=a/b;
        System.out.println(c);
    }
}
