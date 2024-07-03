package Interview;

import java.util.Arrays;

public class EvenOdd {

    public static void main(String[] args) {
        int[] arr={2,4,5,1,7,8,9,3,6};
        int startIndex=0;
        int lastIndex= arr.length-1;
        int[] ab=new int[arr.length];

        for (int i=0;i< arr.length;i++){
            if(arr[i] % 2 ==0)
                ab[startIndex++]=arr[i];
            else
                ab[lastIndex--]=arr[i];


        }
        System.out.println(Arrays.toString(ab));
    }
}
