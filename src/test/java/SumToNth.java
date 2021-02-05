import java.util.Scanner;

public class SumToNth {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.println("please, enter the number to find out sum upto given number: ");
            int num=sc.nextInt();
            int sum=0;
            for (int i=1; i<=num; i++){
                sum=sum+i;
            }
            System.out.println("sum: "+ sum);
        }
    }
}
