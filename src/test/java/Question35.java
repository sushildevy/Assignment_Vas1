import java.util.Arrays;

public class Question35 {
    public static void main(String[] args) {
        int [] arr = new int [] {3,6,1,9,6,7,5,45,43,22,34};
        Arrays.sort(arr);
        //Arrays.reverse(arr);
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println("\nthe second largest is " + arr[(arr.length)- 2 ] );

    }
}
