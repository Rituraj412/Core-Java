package Basic;

public class Examplee {
    static Examplee e1=new Examplee();
    static {
        System.out.println("SB");
    }
    {
        System.out.println("NSB");
    }
    Examplee(){
        System.out.println("constructor");
    }

    public static void main(String[] args) {
        System.out.println("main");
        Examplee e2=new Examplee();
    }
    static int a=10;
    int x=20;
}
