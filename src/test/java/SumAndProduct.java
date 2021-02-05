import java.util.Scanner;

public class SumAndProduct {
    public static int Sum1 (int num){
        int tmpSum=0;
        while(num!=0){
            int lastDigit=num%10;
            tmpSum+=lastDigit;
            num/=10;
        }
        return tmpSum;

    }
    public static int Product (int num){
        int tmpProduct=1;
        while(num!=0){
            int lastDigit=num%10;
            tmpProduct*=lastDigit;
            num/=10;
        }
        return tmpProduct;


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true) {
            System.out.println("please, enter the number to find sum and product of each: ");
            int num=sc.nextInt();
            System.out.println("Sum is: "+Sum1(num));
            System.out.println("Product is: "+Product(num));
        }

    }
}
