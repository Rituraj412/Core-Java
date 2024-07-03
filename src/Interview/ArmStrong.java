package Interview;

import javax.swing.*;
import java.util.Scanner;

public class ArmStrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some number");
        int n =sc.nextInt();
        checkArmStrong(n);

    }
    public static void checkArmStrong(int n){
        int temp=n;
        int rem=0;
        int sum =0;
            while(n>0){
                rem=n%10;
                sum=sum+(rem*rem*rem);
                n=n/10;
            }
            if(temp == sum)
                System.out.println("Armstrong");
            else
                System.out.println("Not ArmStrong");

            }
    }

