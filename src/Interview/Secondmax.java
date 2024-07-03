package Interview;

public class Secondmax {

    public static void main(String[] args) {
        int[] arr={1,3,4,2,5,6,99999};
        int max=0;
        int secondmax=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                secondmax=max;
                max=arr[i];

            } else if (arr[i] > secondmax) {
                secondmax=arr[i];
                
            }
        }
        System.out.println(secondmax);
    }
}
