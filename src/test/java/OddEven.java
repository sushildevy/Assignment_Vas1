import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (true ){
            System.out.println("Please, enter the integer: ");
            int i=sc.nextInt();
            if(i%2==0){
                System.out.println(i +" is even number.");

            }
            else{
                System.out.println(i + " is odd number.");
            }

        }
    }
}
