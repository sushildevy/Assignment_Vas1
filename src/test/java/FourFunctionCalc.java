import java.util.Scanner;

public class FourFunctionCalc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("please, enter two numbers: ");
            double num1=sc.nextDouble();
            double num2=sc.nextDouble();
            System.out.println("please, enter the operator(+, -, *, / ): ");
            char operator = sc.next().charAt(0);
            double result;
            switch(operator){
                case '+':
                    result=num1+num2;
                    break;
                case '-':
                    result=num1-num2;
                    break;
                case '*':
                    result=num1*num2;
                    break;
                case '/':
                    result=num1/num2;
                    break;

                default:
                    System.out.println("Error! operator is not correct");
                    return;

            }
            System.out.println(num1 +" "+ operator +" "+ num2+" is "+ result );
        }
    }
}
