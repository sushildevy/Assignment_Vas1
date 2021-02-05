import java.util.Scanner;

public class ReverseNum {
        public static void reverseMethod(int number) {
        if (number < 10) {
            System.out.println(number);
            return;
        }
        else {
            System.out.print(number % 10);
            //Method is calling itself: recursion
            reverseMethod(number/10);
        }
    }
        public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            while(true ) {
                int num = 0;
                System.out.println("Please, enter your number and press enter: ");
                num = sc.nextInt();
                System.out.print("Reverse of the input number is:");
                reverseMethod(num);
                System.out.println();
            }
        }
}
