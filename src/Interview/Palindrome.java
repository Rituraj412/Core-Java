package Interview;

public class Palindrome {

    public static void main(String[] args) {
        int n = 122;
        int temp = n;
        int rem = 0;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = (sum * 10) + rem;
            n = n / 10;
        }
        if(temp == sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");

    }


}
