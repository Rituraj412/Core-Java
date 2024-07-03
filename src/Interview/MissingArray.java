package Interview;

public class MissingArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6,8};
        int n = 8;
        int totalSum = n * (n + 1) / 2;
        int sum = 0;
        for (int x : arr) {
            sum = sum + x;
        }
        System.out.println(totalSum-sum);
    }
}
