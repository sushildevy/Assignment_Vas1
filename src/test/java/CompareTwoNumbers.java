import java.util.Scanner;

public class CompareTwoNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        while (true){
            System.out.println("please, enter the two numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            if(num1==num2){
                System.out.println(num1+ " == "+num2);
            }
            else if(num1>num2){
                System.out.println(num1+ "  > "+num2);
            }
            else{
                System.out.println(num1 + " < "+ num2);
            }

        }


    }
}
