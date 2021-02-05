import java.util.Arrays;

public class Question33 {

    public static void main(String[] args) {
        int [] arr = new int [] {3,6,1,9,6,7,5,45,43,22,34};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nAfter Sorting: ");
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}
