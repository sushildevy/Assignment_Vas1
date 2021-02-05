package SwapNumbers;

import java.util.Scanner;

public class SwapNumbers1 {
    private static void swap(int num1, int num2){
        int tmpNum=num1;
        num1=num2;
        num2=tmpNum;
        System.out.println("num1 and num2 are: "+num1 +" and "+num2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Please, enter two numbers: ");
            int num1=in.nextInt();
            int num2=in.nextInt();
            System.out.println("num1 and num2 are: "+num1 +" and "+num2);
            swap(num1,num2);


        }
    }

}
