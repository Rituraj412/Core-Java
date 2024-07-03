package Interview;

import java.util.Arrays;

public class EvenOddSeperate {

    public static void main(String[] args) {
        int[] arr={1,4,2,3,6,9,8,5,6};
        int evenCount=0;
        int oddCount=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2 == 0)
                evenCount++;
            else
                oddCount++;
        }
        int[] x=new int[evenCount];
        int[] y=new int[oddCount];
        int evenIndex=0;   int oddIndex=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i] % 2==0)
                x[evenIndex++]=arr[i];
            else
                y[oddIndex++]=arr[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
    }
}
