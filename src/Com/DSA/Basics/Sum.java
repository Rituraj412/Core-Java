package Com.DSA.Basics;

import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("please enter some number:");
       int num1 = s.nextInt();
       int num2 = s.nextInt();

       int sum=num1 + num2;
        System.out.println("sum is:"+sum);
    }


}
