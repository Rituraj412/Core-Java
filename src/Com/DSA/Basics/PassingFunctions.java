package Com.DSA.Basics;

import java.util.Arrays;

public class PassingFunctions {

    public static void main(String[] args) {
        int[] nums = {3,4,5,12,67};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));

    }
    static void change(int[] arr){
        arr[0] = 99;
        arr[2] = 55;
    }


}
