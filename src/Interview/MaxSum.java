package Interview;

public class MaxSum {

    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,6,99999};
        int max=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
}
