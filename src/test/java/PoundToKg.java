import java.util.Scanner;

public class PoundToKg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Please enter the temperature in pound: ");
            double weight_In_Pound=sc.nextDouble();
            double weight_In_Kg=weight_In_Pound*0.45359237;
            System.out.println(weight_In_Pound +" pound is "+weight_In_Kg + " kg" );
        }
    }
}
