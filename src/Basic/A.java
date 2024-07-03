package Basic;

public class A {

   static int a=10;

   static void m1(int a){
       System.out.println(a);
         A.a=50;

    }

    public static void main(String[] args) {
        System.out.println(a);
        m1(45);
        System.out.println(a);
    }
}
