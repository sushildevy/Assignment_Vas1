import java.util.Arrays;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true ){
            System.out.println("please, enter three numbers");
            int num1=sc.nextInt();
            int num2=sc.nextInt();
            int num3=sc.nextInt();
            int [] arr= {num1,num2,num3} ;
            Arrays.sort(arr);
            System.out.println("The max num is "+ arr[2]);

        }

    }
}
