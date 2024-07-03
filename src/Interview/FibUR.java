package Interview;

public class FibUR {
    static int a=0,b=0,c=0;
    static void printFibUR(int count){
        if(count>0)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(" "+c);
            printFibUR(count-1);
        }
    }

    public static void main(String[] args) {
        int count=10;
        System.out.print(a+" "+b);
        printFibUR(count-2);
    }
}
