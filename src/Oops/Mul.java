package Oops;

public class Mul implements Calculate{
    @Override
    public void Calculate(int a, int b) {
        int c=a*b;
        System.out.println(c);
    }
}
