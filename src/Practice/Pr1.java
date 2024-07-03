package Practice;

public class Pr1 {
    int X=10;
    {
        System.out.println("Hi");
    }
    Pr1(){
        System.out.println("NPC");
    }

    public static void main(String[] args) {
        System.out.println("main start");
        Pr1 p=new Pr1();

        System.out.println("main end");
    }
}
