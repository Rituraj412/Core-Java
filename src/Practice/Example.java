package Practice;

import java.util.Scanner;

public class Example{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please pass an integer");
        int num = sc.nextInt();
        printResult(num);
    }

    static void printResult(int num){
        if(num % 11==0)
            System.out.println("Foo");
        else if(num % 17==0)
            System.out.println("Bar");
        else if (num % 11==0  && num % 17 ==0)
            System.out.println("FooBar");


    }
}
