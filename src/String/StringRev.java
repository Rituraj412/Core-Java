package String;

import java.util.Scanner;

public class StringRev {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String s=sc.nextLine();
    }
    public void StringReverse(String s){
        if(s.length() == 0 || s==null){
            System.out.println(s);
        }
    }
}
