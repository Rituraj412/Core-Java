package Interview;

public class Matching {

    public static void main(String[] args) {
        int[] arr = {3,6,2,9,3,6,3,9,2};
        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    count++;
                }
            }

        }
        System.out.println("Matched:"+(count)+"");

    }
}
