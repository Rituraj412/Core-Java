package Interview;

import java.util.Scanner;

public class PerfectNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter some Integer: ");
            int n = sc.nextInt();
            checkPerfectNumber(n);
        }

        private static void checkPerfectNumber(int n) {
            int sum=0;
            for(int i=1; i<=n/2 ; i++) {
                if(n%i==0)
                    sum = sum +i;
            }
            if(n==sum)
                System.out.println(n +" is a perfect number");
            else
                System.out.println(n + " is not a perfect number");
    }
}
