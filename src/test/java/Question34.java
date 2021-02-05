public class Question34 {
    public static void main(String[] args) {
        //Initialize array
        int [] arr = new int [] {3,6,1,9,6,7,5,45,43,22,34};
        System.out.println("Original array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Array in reverse order: ");
        //Loop through the array in reverse order
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
