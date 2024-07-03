package NewFea;

public class Demo2 {

    public static void main(String[] args) {
        Hello h=new Hello();
        h.test();

    }
}
interface A{
    default void show(){
        System.out.println("A-show()");
    }
}

interface B{
    default void show(){
        System.out.println("B-show()");
    }
}

class Hello implements A,B{

    @Override
    public void show() {
        System.out.println("Hello- show()");
    }
    public void test(){
        System.out.println("Hello-test()");
        show();
        A.super.show();
        B.super.show();
    }
}