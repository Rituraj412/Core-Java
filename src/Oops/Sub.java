package Oops;

public class Sub implements Calculate{
    @Override
    public void Calculate(int a, int b) {
        int c=a-b;
        System.out.println(c);
    }
}
