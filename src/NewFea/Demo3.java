package NewFea;

public class Demo3 {

    public static void main(String[] args) {
        Helo h=(a, b) ->{
            System.out.println("Lambda code starts");
            try {
                int res= a/b;
                System.out.println("Result is"+ res);
            }catch (Exception e){
                e.printStackTrace();
            }
            System.out.println("Lamda code ends");

        } ;
        h.test(10,0);
    }
}

interface Helo{
    void test(int a,int b) throws ArithmeticException;
}
