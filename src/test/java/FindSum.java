import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {
        System.out.println("Please, enter two numbers: ");
        while(true) {

            Scanner Sc=new Scanner(System.in);
            int num1 = Sc.nextInt();
            int num2 = Sc.nextInt();
            int numSum = num1 + num2;
            if (numSum==0)
                    break;
            double average;
            System.out.println("Sum of" + num1 + " and " + num2 + " is: " + numSum);
            if (numSum > 0) {
                average = (numSum / 2);
                System.out.println("average is: " + average);
            } else {
                System.out.println("average cannot be calculated");
            }


            System.out.println("Please, enter two numbers: ");
        }



    }
}
