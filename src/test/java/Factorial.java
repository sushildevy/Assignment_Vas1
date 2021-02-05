import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("please, enter the number to find the factorial: ");
            int num=sc.nextInt();
            int fact=1;
            for (int i=1; i<=num; i++){
                fact=fact*i;
            }
            System.out.println("factorial of :"+ num +" is " + fact);
        }
    }
}
