package Com.DSA.Basics;

import java.util.Arrays;
import java.util.Scanner;

public class Lec8 {

    public static void main(String[] args) {

        for (int num = 0; num < 7; num++) {
            System.out.println(num);
        }

    }

    public static class Arr {

        public static void main(String[] args) {

    //        String[] arr = new String[4];
    //        System.out.println(arr[0]);
            Scanner sc = new Scanner(System.in);
            int[] arr= new int[5];
            arr[0] = 23;
            arr[1] = 45;
            arr[2] = 233;
            arr[3] = 543;
            arr[4] = 311;
            System.out.println(Arrays.toString(arr));

        }
    }


}
